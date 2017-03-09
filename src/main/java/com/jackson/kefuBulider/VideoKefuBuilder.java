package com.jackson.kefuBulider;

import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;

/**
 * Created by zhangtianyu on 2017/2/14.
 */
public class VideoKefuBuilder{
    //构造视频消息回复
    public WxMpKefuMessage build(String title,String mediaId,String thumMediaId,String description,WxMpXmlMessage wxMessage) {
        WxMpKefuMessage m = WxMpKefuMessage.VIDEO().toUser(wxMessage.getFromUser()).title(title).mediaId(mediaId).thumbMediaId(thumMediaId).description(description).build();
        return m;
    }
}
