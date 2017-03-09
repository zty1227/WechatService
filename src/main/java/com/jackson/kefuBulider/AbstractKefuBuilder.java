package com.jackson.kefuBulider;

import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhangtianyu on 2017/1/11.
 */
public abstract class AbstractKefuBuilder {
    //日志
    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public abstract WxMpKefuMessage build(String content,WxMpXmlMessage wxMessage);
}
