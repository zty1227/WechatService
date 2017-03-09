package com.jackson.kefuBulider;

import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;

/**
 * Created by zhangtianyu on 2017/2/14.
 */
public class NewsKefuBuilder {
    //构造图文消息回复
    public WxMpKefuMessage build(String url,String picUrl,String description,String title,WxMpXmlMessage wxMessage) {
        WxMpKefuMessage.WxArticle article1 = new WxMpKefuMessage.WxArticle();
        article1.setUrl(url);
        article1.setPicUrl(picUrl);
        article1.setDescription(description);
        article1.setTitle(title);
        WxMpKefuMessage m =WxMpKefuMessage.NEWS().toUser(wxMessage.getFromUser()).addArticle(article1).build();
        return m;
    }
}
