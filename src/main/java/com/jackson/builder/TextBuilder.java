package com.jackson.builder;

import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutTextMessage;

/**
 * Created by zhangtianyu on 2017/1/11.
 */
public class TextBuilder extends AbstractBuilder {


    @Override
    public WxMpXmlOutMessage build(String content, WxMpXmlMessage wxMessage) {

        //构造文字回复
        WxMpXmlOutTextMessage m = WxMpXmlOutMessage.TEXT().content(content).fromUser(wxMessage.getToUser()).toUser(wxMessage.getFromUser()).build();
        return m;
    }
}
