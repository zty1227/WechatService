package com.jackson.kefuBulider;

import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;

/**
 * Created by zhangtianyu on 2017/2/14.
 */
public class MusicKefuBuilder {
    //构造音乐消息回复
    public WxMpKefuMessage build(String title,String thumMediaId,String description,String musicUrl,String hqMusicUrl,WxMpXmlMessage wxMessage) {
        WxMpKefuMessage m = WxMpKefuMessage.MUSIC().toUser(wxMessage.getFromUser()).title(title).thumbMediaId(thumMediaId).description(description).musicUrl(musicUrl).hqMusicUrl(hqMusicUrl).build();
        return m;
    }
}
