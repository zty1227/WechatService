package com.jackson.kefuBulider;

import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;

/**
 * Created by zhangtianyu on 2017/2/13.
 */
public class TextKefuBuilder extends AbstractKefuBuilder {
    @Override
    public WxMpKefuMessage build(String content, WxMpXmlMessage wxMessage) {
        //构造客服消息回复
        WxMpKefuMessage m = WxMpKefuMessage.TEXT().toUser(wxMessage.getFromUser()).content(content).build();
        return m;
    }
}
