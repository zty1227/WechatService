package com.jackson.service.weixin.impl;

import com.jackson.service.weixin.TemplateMessageService;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateData;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangtianyu on 2017/1/18.
 */
@Service
public class TemplateMessageServiceImpl implements TemplateMessageService {

    // 模板消息字体颜色
    private static final String TEMPLATE_FRONT_COLOR = "#32CD32";
    @Autowired
    protected WxMpConfigStorage configStorage;
    @Autowired
    protected WxMpService wxMpService;

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void sendTemplateTest(String openid) throws Exception {
        WxMpTemplateMessage wxMpTemplateMessage = new WxMpTemplateMessage();
        String url = "http://www.guideq.cn";
        wxMpTemplateMessage.setToUser(openid);
        wxMpTemplateMessage.setTemplateId("N4NLOvMMLbffRVODavV9vYepZFaMbmm1ajjxkVXaryM");
        wxMpTemplateMessage.setUrl(url);
        WxMpTemplateData testData = new WxMpTemplateData("first", "test", TEMPLATE_FRONT_COLOR);
        wxMpTemplateMessage.addWxMpTemplateData(testData);
        System.out.println(wxMpTemplateMessage);
        try {
            wxMpService.getTemplateMsgService().sendTemplateMsg(wxMpTemplateMessage);
        } catch (WxErrorException e) {
            logger.error(e.getMessage().toString());
        }
    }
}
