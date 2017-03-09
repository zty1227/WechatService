package com.jackson.handler;

import com.jackson.service.weixin.UserInfoService;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by zhangtianyu on 2017/1/12.
 */
@Component
public class UnsubscribeHandler extends AbstractHandler {

    @Autowired
    private UserInfoService userInfoService;

    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage, Map<String, Object> context, WxMpService wxMpService, WxSessionManager sessionManager) throws WxErrorException {
        String openId = wxMessage.getFromUser();
        this.logger.info("取消关注用户OPENID:" + openId);

        //TODO 可以添加一些业务逻辑操作 比如删除本地数据库数据的操作
        try {
            deleteUser(openId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private void deleteUser(String openId) throws Exception {
        System.out.println(openId);

        if(userInfoService.findByOpenId(openId) != null){
            int i = userInfoService.deleteByOpenId(openId);
        }
    }
}
