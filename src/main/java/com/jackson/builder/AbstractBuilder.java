package com.jackson.builder;

import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhangtianyu on 2017/1/11.
 */
public abstract class AbstractBuilder {
    //日志
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public abstract WxMpXmlOutMessage build(String content,WxMpXmlMessage wxMessage);
}
