package com.jackson.controller;

import com.jackson.entity.WeiboData;
import com.jackson.service.weibo.CrawlService;
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
 * Created by zhangtianyu on 2017/3/8.
 */
@Controller
public class WeiboSpiderController extends GenericController {

    @Autowired
    protected CrawlService crawlService;
    @Autowired
    protected WbDataService wbDataService;

    @RequestMapping(value = "spider")
    public String spider(){
//        crawlService.weiboCrawl();
        return "spider";
    }

    @RequestMapping(value = "travspider")
    @ResponseBody
    public String travspider(@RequestBody HashMap<String, Object> map) throws Exception {

        return "asd";
    }

    @RequestMapping(value = "weibo")
    private ModelAndView weibo(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("weibo");
        try {
            List<WeiboData> weiboDataList = wbDataService.findAll();
            mv.addObject("weiboDataList",weiboDataList);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mv;
    }
}
