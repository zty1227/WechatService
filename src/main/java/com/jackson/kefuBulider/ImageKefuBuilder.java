package com.jackson.kefuBulider;

import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;

/**
 * Created by zhangtianyu on 2017/2/13.
 */
public class ImageKefuBuilder extends AbstractKefuBuilder {
    @Override
    public WxMpKefuMessage build(String content, WxMpXmlMessage wxMessage) {
        String mediaId = content;
        WxMpKefuMessage m = WxMpKefuMessage.IMAGE().toUser(wxMessage.getFromUser()).mediaId(mediaId).build();
        return m;
    }

    public WxMpKefuMessage buildImg(String content,String openid) {
        String mediaId = content;
        WxMpKefuMessage m = WxMpKefuMessage.IMAGE().toUser(openid).mediaId(mediaId).build();
        return m;
    }
}
