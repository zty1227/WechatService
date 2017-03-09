package com.jackson.controller;

import com.jackson.config.MenuConfig;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhangtianyu on 2017/1/13.
 */
@Controller
public class MenuController extends GenericController {

    @Autowired
    protected WxMpConfigStorage wxMpConfigStorage;

    @Autowired
    protected WxMpService wxMpService;

    /**
     * @param
     * @return
     * @Title setMenu
     * @Decription 用于创建自定义菜单
     * @author zhangtianyu
     * @Date 2017/1/13
     */
    @RequestMapping(value = "setMenu")
    public ModelAndView setMenu() throws WxErrorException {
        ModelAndView mv = new ModelAndView();
        wxMpService.getMenuService().menuCreate(MenuConfig.getMenu());
        mv.setViewName("success");
        return mv;
    }
}
