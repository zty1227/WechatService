package com.jackson.controller;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhangtianyu on 2017/1/25.
 */

@Controller
@RequestMapping("oauth")
public class OAuthController extends GenericController {

    @Autowired
    protected WxMpService wxMpService;

    @Autowired
    protected WxMpConfigStorage wxMpConfigStorage;

    @RequestMapping(value = "oauth")
    public ModelAndView oauth(String code) throws WxErrorException {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("userInfo");
        if(null !=code){
            WxMpOAuth2AccessToken wxMpOAuth2AccessToken = wxMpService.oauth2getAccessToken(code);
            WxMpUser wxMpUser1 = wxMpService.oauth2getUserInfo(wxMpOAuth2AccessToken,null);
            mv.addObject("userInfo",wxMpUser1);
        }
        return mv;
    }

    /**
     * 通过code获得基本用户信息
     * 详情请见: http://mp.weixin.qq.com/wiki/14/bb5031008f1494a59c6f71fa0f319c66.html
     *
     * @param response
     * @param code     code
//     * @param lang     zh_CN, zh_TW, en
     */
    @RequestMapping(value = "getOAuth2UserInfo")
    public void getOAuth2UserInfo(HttpServletResponse response, @RequestParam(value = "code") String code) {
        ModelAndView mv = new ModelAndView();
        WxMpOAuth2AccessToken accessToken;
        WxMpUser wxMpUser;
        try {
            accessToken = this.wxMpService.oauth2getAccessToken(code);
            System.out.println("OAuth2accessToken---------------"+accessToken);
            wxMpUser = wxMpService.oauth2getUserInfo(accessToken,null);
            System.out.println(wxMpUser.toString());
            //TODO 网页授权对应的用户信息可以在此持久化
            /*wxMpUser = this.wxMpService.getUserService()
                    .userInfo(accessToken.getOpenId(), lang);*/
            mv.setViewName("userInfo");
            mv.addObject("userInfo", wxMpUser);
        } catch (WxErrorException e) {
            mv.addObject(new WxMpUser());
            this.logger.error(e.getError().toString());
        }
    }
}
