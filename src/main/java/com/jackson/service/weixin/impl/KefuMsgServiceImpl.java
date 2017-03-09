package com.jackson.service.weixin.impl;

import com.jackson.service.weixin.KefuMsgService;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangtianyu on 2017/2/13.
 */
@Service
public class KefuMsgServiceImpl implements KefuMsgService{

    @Autowired
    WxMpConfigStorage configStorage;
    @Autowired
    WxMpService wxMpService;

    @Override
    public void sendKefuMsg(WxMpKefuMessage content) throws Exception {
        // 设置消息的内容等信息
        wxMpService.getKefuService().sendKefuMessage(content);
    }
}
