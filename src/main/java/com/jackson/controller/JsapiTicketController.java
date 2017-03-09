package com.jackson.controller;

import com.jackson.util.SignUtil;
import me.chanjar.weixin.common.bean.WxJsapiSignature;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by zhangtianyu on 2017/1/26.
 */
@Controller
@RequestMapping(value = "getTicket")
public class JsapiTicketController extends GenericController {

    @Autowired
    protected WxMpService wxMpService;

    @Autowired
    protected WxMpConfigStorage configStorage;

    @RequestMapping(value = "jsapiTicket")
    public String getJsTicket(Model model){
        try {
            String ticket = wxMpService.getJsapiTicket();
            System.out.println(ticket);
            model.addAttribute("ticket",ticket);
        } catch (Exception e) {
            model.addAttribute("ticket","error");
            e.printStackTrace();
        }
        return "index";
    }

    @RequestMapping(value = "signature")
    public @ResponseBody WxJsapiSignature signature(String url) throws WxErrorException {
//        String ticket = wxMpService.getJsapiTicket();
        logger.info(configStorage.getAppId());
        WxJsapiSignature wxJsapiSignature = wxMpService.createJsapiSignature(url);
//        Map<String, String> wx = SignUtil.sign(ticket,url);
//        System.out.println(ticket);
        System.out.println("--------"+wxJsapiSignature.toString());
        return wxJsapiSignature;
    }

    @RequestMapping(value = "signature1")
    public @ResponseBody Map<String,String> signature1(String url) throws WxErrorException {
        String ticket = wxMpService.getJsapiTicket();
        Map<String, String> wx = SignUtil.sign(ticket, url);
        String appId = this.configStorage.getAppId();
        wx.put("appId",appId);
        System.out.println(appId+"-------");
        return wx;
    }
}
