package com.jackson.handler;

import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author zhangtianyu
 * @Tile LogHandler
 * @Description  对所有接收到的消息输出日志，也可进行持久化处理
 * @return
 * @Date 2017/1/11
 */
@Component
public class LogHandler extends AbstractHandler {
    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage,
                                    Map<String, Object> context, WxMpService wxMpService,
                                    WxSessionManager sessionManager) {

        //TODO 将用户发送的请求消息打印出来
        this.logger.info("\n接收到请求消息，内容：【{}】", wxMessage.toString());
        return null;
    }
}