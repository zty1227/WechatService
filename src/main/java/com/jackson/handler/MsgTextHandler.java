package com.jackson.handler;

import com.jackson.builder.NewsBuilder;
import com.jackson.builder.TextBuilder;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutNewsMessage;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author zhangtianyu
 * @Tile MsgTextHandler
 * @Description 转发客户消息给客服Handler 或者进行关键字回复
 * @Data 2017/1/11
 */
@Component
public class MsgTextHandler extends AbstractHandler {
    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage, Map<String, Object> context, WxMpService wxMpService, WxSessionManager sessionManager) throws WxErrorException {


        if (!wxMessage.getMsgType().equals(WxConsts.XML_MSG_DEVICE_EVENT)) {
            //TODO 可以选择将消息保存到本地或者到数据库 对用户发送的消息进一步处理
        }
        //&& weixinService.hasKefuOnline()
        //当用户输入关键字如"你好","客服"等,并且有客服在线时,把消息转发给在线客服
        if (StringUtils.startsWithAny(wxMessage.getContent(), "你好", "客服")) {
            return WxMpXmlOutMessage
                    .TRANSFER_CUSTOMER_SERVICE().fromUser(wxMessage.getToUser())
                    .toUser(wxMessage.getFromUser()).build();
        }
        if (wxMessage.getMsgType().equals(WxConsts.XML_MSG_TEXT)) {
            //TODO 这里可以做关键字回复 回复的消息可以是多种 这里回复图文消息作分享统计功能测试
            if (wxMessage.getContent().equals("分享功能测试")){
                WxMpXmlOutNewsMessage.Item item = new WxMpXmlOutNewsMessage.Item();
                item.setDescription("gakki是笑的最美的女星");
                item.setPicUrl("http://wxzty.tunnel.2bdata.com/wechatService/img/1.jpg");
                item.setTitle("我最爱的gakki");
                item.setUrl("http://wxzty.tunnel.2bdata.com/wechatService/testShare?openid="+wxMessage.getFromUser());
                logger.info(item.getUrl()+"---------------");
                return new NewsBuilder().build(item, wxMessage);
            }
            else {
                String content = "您发送的是文字消息";
                return new TextBuilder().build(content,wxMessage);
            }
        }

        return null;
    }
}
