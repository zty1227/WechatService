package com.jackson.controller;

import com.jackson.entity.WeixinUserInfo;
import com.jackson.service.weixin.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by zhangtianyu on 2017/2/20.
 */
@Controller
public class WxUserInfoController extends GenericController {

    @Autowired
    protected UserInfoService userInfoService;

    @RequestMapping(value = "allUser")
    public ModelAndView allUser(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("allUser");
        List<WeixinUserInfo> allUser = null;
        try {
            allUser = userInfoService.findAllUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
        mv.addObject("userInfo",allUser);
        return mv;
    }

    @RequestMapping(value = "aleadyZone")
    public ModelAndView aleadyZone() throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("aleadyZone");
        List<WeixinUserInfo> aleadyZoneUser = null;
        aleadyZoneUser = userInfoService.findUserByIsZone(true);
        mv.addObject("userInfo",aleadyZoneUser);
        return mv;
    }


    @RequestMapping(value = "notZone")
    public ModelAndView notZone() throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("notZone");
        List<WeixinUserInfo> noZoneUser = null;
        noZoneUser = userInfoService.findUserByIsZone(false);
        mv.addObject("userInfo",noZoneUser);
        return mv;
    }

    @RequestMapping(value = "notZoneReact")
    public @ResponseBody String notZoneReact(@RequestBody HashMap<String,Object> map) throws Exception {
        String openid = map.get("openid").toString();
        String area =  map.get("area").toString();
        System.out.println(area + "--------" + openid);
        WeixinUserInfo weixinUserInfo = userInfoService.findByOpenId(openid);
        weixinUserInfo.setArea(area);
        weixinUserInfo.setIszone(true);
        System.out.println(weixinUserInfo.toString());
        userInfoService.updateByOpenId(weixinUserInfo);
        return "ok";
    }

    @RequestMapping(value = "aleadyZoneReact")
    public @ResponseBody List<WeixinUserInfo> aleadyZoneReact(@RequestBody HashMap<String,Object>map)throws Exception{
        String area = map.get("area").toString();
        List<WeixinUserInfo> aleadyZoneArea = null;
        aleadyZoneArea = userInfoService.findByArea(area);
        return aleadyZoneArea;
    }
}
