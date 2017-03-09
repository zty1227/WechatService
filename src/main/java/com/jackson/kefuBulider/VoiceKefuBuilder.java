package com.jackson.kefuBulider;

import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;

/**
 * Created by zhangtianyu on 2017/2/13.
 */
public class VoiceKefuBuilder extends AbstractKefuBuilder {
    //构造语音消息回复
    @Override
    public WxMpKefuMessage build(String content, WxMpXmlMessage wxMessage) {
        WxMpKefuMessage m = WxMpKefuMessage.VOICE().toUser(wxMessage.getFromUser()).mediaId("MEDIA_ID").build();
        return m;
    }
}
