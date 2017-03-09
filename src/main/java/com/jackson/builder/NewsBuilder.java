package com.jackson.builder;

import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutNewsMessage;

/**
 * Created by zhangtianyu on 2017/2/7.
 */
public class NewsBuilder {

    public WxMpXmlOutMessage build(WxMpXmlOutNewsMessage.Item item, WxMpXmlMessage wxMessage) {

        //构造图文消息回复
        WxMpXmlOutNewsMessage m = WxMpXmlOutMessage.NEWS().addArticle(item).fromUser(wxMessage.getToUser()).toUser(wxMessage.getFromUser()).build();
        return m;
    }
}
