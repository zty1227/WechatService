package com.jackson.handler;

import com.jackson.builder.TextBuilder;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author zhangtianyu
 * @Ttle LocationHandler
 * @Description 对用户发送的地理位置消息进行处理
 * @return
 * @Date 2017/1/11
 */
@Component
public class LocationHandler extends AbstractHandler {

    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage, Map<String, Object> context, WxMpService wxMpService, WxSessionManager sessionManager) throws WxErrorException {


        if (wxMessage.getMsgType().equals(WxConsts.XML_MSG_LOCATION)) {
            //TODO 接受处理用户发送的地理位置消息
            try {
                String content = "感谢反馈,您的地理位置已经收到!";
                return new TextBuilder().build(content, wxMessage);
            } catch (Exception e){
                this.logger.error("位置消息接受处理失败",e);
                return null;
            }
        }

        //可以把地理位置打印出来 上报地理位置事件
        this.logger.info("\n上报地理位置...");
        this.logger.info("\n纬度: " + wxMessage.getLatitude());
        this.logger.info("\n经度: " + wxMessage.getLongitude());
        this.logger.info("\n精度: " + String.valueOf(wxMessage.getPrecision()));

        //TODO 可以将用户发送的地理位置信息保存到本地数据库,以方便以后使用
        return null;
    }
}
