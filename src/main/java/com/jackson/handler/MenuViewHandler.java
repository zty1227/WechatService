package com.jackson.handler;

import com.jackson.service.weixin.WxMediaService;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author zhangtianyu
 * @Tile MenuViewHandler
 * @Description 这是自定义菜单里面的view事件处理
 * @return
 * @Date 2017/1/12
 */
@Component
public class MenuViewHandler extends AbstractHandler {

    @Autowired
    protected WxMpService wxMpService;
    @Autowired
    protected WxMediaService wxMediaService;

    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage, Map<String, Object> context, WxMpService wxMpService, WxSessionManager sessionManager) throws WxErrorException {

        String eventkey = wxMessage.getEventKey();
        logger.info(eventkey);
        switch (eventkey){
            case "pay":
                break;
            default:
                break;
        }
        return null;
    }
}
