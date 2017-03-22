package com.jackson.controller;

import com.jackson.entity.WeiboData;
import com.jackson.service.weibo.WbDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
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
    public ModelAndView weiboTemp(HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<WeiboData> weiboDataList = null;
        weiboDataList = wbDataService.findAll();
        mv.setViewName("weiboTemp");
        mv.addObject("weiboDataList", weiboDataList);
        mv.addObject("counts", weiboDataList.size());
        mv.addObject("zone", "all");
        mv.addObject("pageSize", 20);
        return mv;
    }

    @RequestMapping(value = "selectZone")
    public ModelAndView searchZone(HttpServletRequest request) throws Exception {
        ModelAndView mv = new ModelAndView();
        String zone = request.getParameter("selectZone");
        System.out.println(zone);
        List<WeiboData> weiboDataList = null;
        if ("all".equals(zone)) {
            weiboDataList = wbDataService.findAll();
        } else {
            weiboDataList = wbDataService.findByZone(zone);
        }
        System.out.println(weiboDataList.size());
        mv.setViewName("weiboTemp");
        mv.addObject("weiboDataList", weiboDataList);
        mv.addObject("pageSize", 20);
        mv.addObject("counts", weiboDataList.size());
        mv.addObject("zone", zone);
        mv.addObject("selectZone", zone);
        return mv;
    }

    @RequestMapping(value = "/refer")
    @ResponseBody
    public String refer(@RequestBody HashMap<String, Object> map) throws Exception {
        String contentid = map.get("contentid").toString();
        System.out.println(contentid);
        WeiboData weiboData = wbDataService.findByContentId(contentid);
        weiboData.setIscheck(true);
        wbDataService.updateByContentId(weiboData);
//        System.out.println(weiboData.toString());
        return "ok";
    }
//    @RequestMapping(value = "weiboZone")
//    public
//    @ResponseBody
//    List<WeiboData> aleadyZoneReact(@RequestBody HashMap<String, Object> map, HttpServletRequest request) throws Exception {
//        String zone = map.get("zone").toString();
//        System.out.println(zone);
//        List<WeiboData> weiboDataList = null;
//        if ("all".equals(zone)) {
//            weiboDataList = wbDataService.findAll();
//        } else {
//            weiboDataList = wbDataService.findByZone(zone);
//        }
//        System.out.println(weiboDataList.size());
//        request.getSession().setAttribute("totalPage", weiboDataList.size());
//        return weiboDataList.subList(0, 20);
//    }

    /**
     * ajax
     *
     * @param pageIndex pageSize
     * @param totalPage
     * @return
     */
    @RequestMapping("/ajax_operation")
    public
    @ResponseBody
    List<WeiboData> findSingerAjax1(String pageIndex, String pageSize, String totalPage, String zone) throws Exception {
        return ajax_common1(pageIndex, pageSize, totalPage, zone);

    }

    /**
     * 返回每页的数据
     *
     * @param pageIndex pageSize
     * @param totalPage
     * @return
     */
    public List<WeiboData> ajax_common1(String pageIndex, String pageSize, String totalPage, String zone) throws Exception {
        List<WeiboData> weiboDataList = null;
//        System.out.println(zone +"------");
        if ("all".equals(zone)) {
            weiboDataList = wbDataService.findAll();
        } else {
            weiboDataList = wbDataService.findByZone(zone);
        }
        Integer pageIndex1 = Integer.parseInt(pageIndex);
        Integer pageSize1 = Integer.parseInt(pageSize);
        Integer totalPage1 = Integer.parseInt(totalPage);
        List<WeiboData> resultList = new ArrayList<WeiboData>();
        if (pageIndex1 <= totalPage1 / pageSize1) {
            resultList = weiboDataList.subList((pageIndex1 - 1) * pageSize1, pageIndex1 * pageSize1);
        } else {
            resultList = weiboDataList.subList((pageIndex1 - 1) * pageSize1, totalPage1);
        }
        return resultList;
    }

}
