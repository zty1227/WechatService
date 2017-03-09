package com.jackson.service.weixin;

import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;

/**
 * Created by zhangtianyu on 2017/2/13.
 */
public interface KefuMsgService {
    void sendKefuMsg(WxMpKefuMessage content)throws Exception;
}
