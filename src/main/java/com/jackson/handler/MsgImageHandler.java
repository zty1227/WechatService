package com.jackson.handler;

import com.jackson.builder.TextBuilder;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by zhangtianyu on 2017/2/14.
 * 对用户发送的图片消息进行处理
 */
@Component
public class MsgImageHandler extends AbstractHandler{
    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage, Map<String, Object> context, WxMpService wxMpService, WxSessionManager sessionManager) throws WxErrorException {

        if(wxMessage.getMsgType().equals(WxConsts.XML_MSG_IMAGE)){

            //TODO 可以把用户发送的图片消息在此持久化

            //提示用户发送的消息类型
            String content = "您发送的是图片消息";
            return new TextBuilder().build(content,wxMessage);
        }

        return null;
    }
}
