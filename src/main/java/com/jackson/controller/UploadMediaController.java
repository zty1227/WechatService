package com.jackson.controller;

import com.jackson.entity.WeixinMedia;
import com.jackson.kefuBulider.ImageKefuBuilder;
import com.jackson.service.weixin.KefuMsgService;
import com.jackson.service.weixin.WxMediaService;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by zhangtianyu on 2017/2/13.
 */
@Controller
@RequestMapping(value = "wxUpload")
public class UploadMediaController extends GenericController{

    @Autowired
    protected WxMpService wxMpService;
    @Autowired
    protected WxMediaService wxMediaService;
    @Autowired
    protected KefuMsgService kefuMsgService;

    private List<String> media_ids = new ArrayList<>();

    @RequestMapping("uploadImg")
    public ModelAndView uploadimg() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("imgUpload");
//        System.out.println("用户id："+openid);
//        mv.addObject("openid",openid);
        mv.addObject("commentId",2);//如果分享的话，统计这个页面
        return mv;
    }


    @RequestMapping("saveImg")
    public @ResponseBody String saveImg(@RequestBody HashMap<String,Object> map) throws Exception {
        String type =  map.get("mediaType").toString();
        String openid = map.get("openid").toString();
        System.out.println(type + "--------" + openid);
        ArrayList<String> media_id = (ArrayList<String>) map.get("imgs");
        System.out.println(media_id);
        System.out.println("MediaidSize:"+media_id.size());
        for (int i=0;i<media_id.size();i++){
            WeixinMedia weixinMedia = new WeixinMedia();
            weixinMedia.setTmp("1");
            weixinMedia.setCreatat(System.currentTimeMillis());
            weixinMedia.setMediaid(media_id.get(i));
            System.out.println("Mediaid:"+weixinMedia.getMediaid());
           /* if(openid!=null){
                weChatMedia.setOpenid(openid);
                try {
                    customService.sendImageMessage(openid,media_id.get(i));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }*/
            weixinMedia.setOpenid(openid);
            System.out.println("openid:"+openid);
            weixinMedia.setType(type);
            System.out.println("type:"+type);
            System.out.println("weixinMedia:"+weixinMedia.toString());
            WxMpKefuMessage wxMpKefuMessage = new ImageKefuBuilder().buildImg(media_id.get(i),openid);
            kefuMsgService.sendKefuMsg(wxMpKefuMessage);
            wxMediaService.saveMeida(weixinMedia);
        }
        return "ok";
    }
}
