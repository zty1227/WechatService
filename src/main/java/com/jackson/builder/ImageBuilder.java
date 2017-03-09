package com.jackson.builder;

import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutImageMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;

/**
 * Created by zhangtianyu on 2017/1/11.
 */
public class ImageBuilder extends AbstractBuilder {

    @Override
    public WxMpXmlOutMessage build(String content, WxMpXmlMessage wxMessage) {

        //构造图片回复
        WxMpXmlOutImageMessage m =WxMpXmlOutImageMessage.IMAGE().mediaId(content).fromUser(wxMessage.getToUser()).toUser(wxMessage.getFromUser()).build();

        return m;
    }
}
