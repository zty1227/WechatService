package com.jackson.config;

import me.chanjar.weixin.common.api.WxConsts;
import me.chanjar.weixin.common.bean.menu.WxMenu;
import me.chanjar.weixin.common.bean.menu.WxMenuButton;
import me.chanjar.weixin.mp.api.WxMpService;

/**
 * Created by FirenzesEagle on 2016/6/1 0001.
 * Email:liumingbo2008@gmail.com
 */
public class MenuConfig {

    /**
     * 定义菜单结构
     *
     * @return
     */
    public static WxMenu getMenu(){

        MainConfig mainConfig = new MainConfig();
        WxMpService wxMpService = mainConfig.wxMpService();

        WxMenu menu = new WxMenu();
        WxMenuButton button1 = new WxMenuButton();
        button1.setName("功能1");

        WxMenuButton button11 = new WxMenuButton();
        button11.setType(WxConsts.BUTTON_CLICK);
        button11.setName("模板消息");
        button11.setKey("template");

        WxMenuButton button12 = new WxMenuButton();
        button12.setType(WxConsts.BUTTON_CLICK);
        button12.setName("客服功能");
        button12.setKey("service");

        button1.getSubButtons().add(button11);
        button1.getSubButtons().add(button12);

        WxMenuButton button2 = new WxMenuButton();
        button2.setName("功能2");

        WxMenuButton button21 = new WxMenuButton();
        button21.setType(WxConsts.BUTTON_CLICK);
        button21.setName("网页授权");
        button21.setKey("impower");


        WxMenuButton button22 = new WxMenuButton();
        button22.setType(WxConsts.BUTTON_CLICK);
        button22.setName("分享统计");
        button22.setKey("tongji");

        button2.getSubButtons().add(button21);
        button2.getSubButtons().add(button22);

        WxMenuButton button3 = new WxMenuButton();
        button3.setName("功能3");

        WxMenuButton button31 = new WxMenuButton();
        button31.setType(WxConsts.BUTTON_CLICK);
        button31.setName("上传图片");
        button31.setKey("upload");
//        button31.setUrl("http://wxzty.tunnel.2bdata.com/wechatService/wxUpload/uploadimg");

        WxMenuButton button32 = new WxMenuButton();
        button32.setType(WxConsts.BUTTON_VIEW);
        button32.setName("支付功能");
        button32.setKey("pay");
        button32.setUrl("http://www.guideq.cn");

        WxMenuButton button33 = new WxMenuButton();
        button33.setType(WxConsts.BUTTON_VIEW);
        button33.setName("测试页面");
        button33.setKey("wxdemo");
        button33.setUrl("http://wxzty.tunnel.2bdata.com/wechatService/testJsp1");


        button3.getSubButtons().add(button31);
        button3.getSubButtons().add(button32);
        button3.getSubButtons().add(button33);

        menu.getButtons().add(button1);
        menu.getButtons().add(button2);
        menu.getButtons().add(button3);

        return menu;

    }

    /**
     * 运行此main函数即可生成公众号自定义菜单
     *
     * @param args
     */
/*    public static void main(String[] args) {
        MainConfig mainConfig = new MainConfig();
        WxMpService wxMpService = mainConfig.wxMpService();
        try {
            wxMpService.getMenuService().menuCreate(getMenu());
        } catch (WxErrorException e) {
            e.printStackTrace();
        }
    }*/

}
