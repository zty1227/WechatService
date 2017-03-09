package com.jackson.handler;

import com.jackson.builder.NewsBuilder;
import com.jackson.builder.TextBuilder;
import com.jackson.kefuBulider.TextKefuBuilder;
import com.jackson.service.weixin.KefuMsgService;
import com.jackson.service.weixin.ShareCountService;
import com.jackson.service.weixin.TemplateMessageService;
import com.jackson.util.Constants;
import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.kefu.WxMpKefuMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutNewsMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;



/**
 * @author zhangtianyu
 * @Ttle MenuClickHandler
 * @Description 这是自定义菜单里面的click事件处理
 * @return
 * @Date 2017/1/11
 */
@Component
public class MenuClickHandler extends AbstractHandler {

    @Autowired
    protected TemplateMessageService templateMessageService;
    @Autowired
    protected WxMpConfigStorage configStorage;
    @Autowired
    protected WxMpService wxMpService1;
    @Autowired
    protected KefuMsgService kefuMsgService;
    @Autowired
    protected ShareCountService shareCountService;


    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage, Map<String, Object> context, WxMpService wxMpService, WxSessionManager sessionManager) throws WxErrorException {
        //TODO 用户点击行为等 可以在此持久化
        String testcontent = "test";
        String eventKey = wxMessage.getEventKey();
//        System.out.println(eventKey);
        switch (eventKey){
            //模板消息功能测试
            case "template":
                try {
                    templateMessageService.sendTemplateTest(wxMessage.getFromUser());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            //客服消息功能初步实现 可以主动发送多种类的消息给用户
            case "service":
                String content1 = "客服功能初步实现";
                WxMpKefuMessage message1 = new TextKefuBuilder().build(content1,wxMessage);
                try {
                    kefuMsgService.sendKefuMsg(message1);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            //网页授权获取用户信息
            case "impower":
                String contentkefu = "请点击以下网址来获取授权";
                WxMpKefuMessage message = new TextKefuBuilder().build(contentkefu,wxMessage);
                try {
                    kefuMsgService.sendKefuMsg(message);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String content2 =wxMpService.oauth2buildAuthorizationUrl("http://wxzty.tunnel.2bdata.com/wechatService/oauth/oauth", WxConsts.OAUTH2_SCOPE_USER_INFO,"");
//                System.out.println(configStorage.toString());
                return new TextBuilder().build(content2,wxMessage);
            //分享统计行为测试
            case "tongji":
                String content3 = null;
                try {
                    content3 = "分享gakki统计\n"+
                            "总次数: "+shareCountService.countAll(1)+"次\n"+
                            "分享给朋友: "+shareCountService.countType(1, Constants.APPMESSAGE)+"次\n"+
                            "分享到朋友圈: "+shareCountService.countType(1,Constants.TIMELINE)+"次\n"+
                            "分享到微博: "+shareCountService.countType(1,Constants.WEIBO)+"次\n"+
                            "分享到QQ: "+shareCountService.countType(1,Constants.QQ)+"次\n"+
                            "分享到QQ空间: "+shareCountService.countType(1,Constants.QZONE)+"次\n";
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return new TextBuilder().build(content3,wxMessage);
            case "upload":
                WxMpXmlOutNewsMessage.Item item = new WxMpXmlOutNewsMessage.Item();
                item.setDescription("这是上传图片功能");
                item.setPicUrl("http://wxzty.tunnel.2bdata.com/wechatService/img/2.jpg");
                item.setTitle("上传功能");
                item.setUrl("http://wxzty.tunnel.2bdata.com/wechatService/wxUpload/uploadImg?openid="+wxMessage.getFromUser());
//                logger.info(item.getUrl()+"---------------");
                return new NewsBuilder().build(item, wxMessage);
            default:
                break;
        }
        //如果不return的话会出现该微信号暂时无法提供服务Bug 暂时用笨方法掩饰.
        return new TextBuilder().build(testcontent,wxMessage);
    }
}
