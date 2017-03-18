package com.jackson.controller;

import com.jackson.entity.WeiboData;
import com.jackson.service.weibo.WbDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

/**
 * Created by zhangtianyu on 2017/3/15.
 */
@Controller
public class WeiboTemplateController {

    @Autowired
    protected WbDataService wbDataService;

    @RequestMapping(value = "weiboTemp")
    public ModelAndView weiboTemp() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("weiboTemp");
        return mv;
    }

    @RequestMapping(value = "weiboZone")
    public
    @ResponseBody
    List<WeiboData> aleadyZoneReact(@RequestBody HashMap<String, Object> map) throws Exception {
        String zone = map.get("zone").toString();
        System.out.println(zone);
        List<WeiboData> weiboDataList = null;
        if ("all".equals(zone)) {
            weiboDataList = wbDataService.findAll();
        } else {
            weiboDataList = wbDataService.findByZone(zone);
        }
        System.out.println(weiboDataList.size());
        return weiboDataList;
    }
}
