package com.jackson.handler;

import com.jackson.builder.TextBuilder;
import com.jackson.entity.WeixinUserInfo;
import com.jackson.service.weixin.CoreService;
import com.jackson.service.weixin.UserInfoService;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;


/**
 * @author zhangtianyu
 * @Tile SubscribeHandler
 * @Description 用户关注公众号Handler
 * @return
 * @Date 2017/1/11
 */
@Component
public class SubscribeHandler extends AbstractHandler {

    @Autowired
    protected WxMpConfigStorage configStorage;
    @Autowired
    protected WxMpService wxMpService;
    @Autowired
    protected CoreService coreService;
    @Autowired
    protected UserInfoService userInfoService;


    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage, Map<String, Object> context, WxMpService wxMpService, WxSessionManager sessionManager) throws WxErrorException {


        this.logger.info(("新关注用户的openId:" + wxMessage.getFromUser()));

        // 获取微信用户基本信息  test先定位zh_CN
        WxMpUser wxMpUser = coreService.getUserInfo(wxMessage.getFromUser(), "zh_CN");
        /*List<NameValuePair> params = new ArrayList<>();
        params.add(new BasicNameValuePair("openId", wxMpUser.getOpenId()));
        params.add(new BasicNameValuePair("nickname", wxMpUser.getNickname()));
        params.add(new BasicNameValuePair("headImgUrl", wxMpUser.getHeadImgUrl()));*/
        if (wxMpUser != null) {
            //TODO(user) 在这里可以进行用户关注时对业务系统的相关操作（比如新增用户）可以将用户信息存入数据库
            String openId = wxMpUser.getOpenId();
            try {
                WeixinUserInfo weixinUserInfo = wxMpUserIntoMyUser(wxMpUser);
                if (userInfoService.findByOpenId(openId) != null) {
                    userInfoService.updateByOpenId(weixinUserInfo);
                } else {
                    saveUser(weixinUserInfo);
                }
                String content = "尊敬的" + wxMpUser.getNickname() + ",您好!";
                logger.info("用户信息" + wxMpUser.toString());
                return new TextBuilder().build(content, wxMessage);
            } catch (Exception e) {
                this.logger.error(e.getMessage(), e);
            }
        }
        return null;
    }

    public static WeixinUserInfo wxMpUserIntoMyUser(WxMpUser wxMpUser) throws Exception {
        WeixinUserInfo weixinUserInfo = new WeixinUserInfo();
        weixinUserInfo.setSubscribe(wxMpUser.getSubscribe());
        weixinUserInfo.setOpenid(wxMpUser.getOpenId());
        weixinUserInfo.setNickname(wxMpUser.getNickname());
        weixinUserInfo.setSex(wxMpUser.getSex());
        weixinUserInfo.setLanguage(wxMpUser.getLanguage());
        weixinUserInfo.setCity(wxMpUser.getCity());
        weixinUserInfo.setProvince(wxMpUser.getProvince());
        weixinUserInfo.setCountry(wxMpUser.getCountry());
        weixinUserInfo.setHeadimgurl(wxMpUser.getHeadImgUrl());
        weixinUserInfo.setUnionid(wxMpUser.getUnionId());
        weixinUserInfo.setSexid(wxMpUser.getSexId());
        weixinUserInfo.setRemark(wxMpUser.getRemark());
        weixinUserInfo.setGroupid(wxMpUser.getGroupId());
        weixinUserInfo.setSubscribetime(wxMpUser.getSubscribeTime());
        weixinUserInfo.setUnionid(wxMpUser.getUnionId());
        weixinUserInfo.setIszone(false);
//        userInfoService.saveUser(weixinUserInfo);
        return weixinUserInfo;
    }

    private void saveUser(WeixinUserInfo weixinUserInfo) throws Exception {
        System.out.println("关注成功");
        userInfoService.saveUser(weixinUserInfo);
    }
}
