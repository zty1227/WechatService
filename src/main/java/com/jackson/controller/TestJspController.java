package com.jackson.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhangtianyu on 2017/1/27.
 */
@Controller
public class TestJspController extends GenericController {

    @RequestMapping(value = "testJsp")
    public ModelAndView testJsp(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        return mv;
    }

    @RequestMapping(value = "testJsp1")
    public ModelAndView testJsp1(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("demo");
        return mv;
    }

    @RequestMapping(value = "testShare")
    public ModelAndView testJsp2(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("testShare");
        return mv;
    }
}
