package com.jackson.controller;

import com.jackson.entity.ShareCount;
import com.jackson.service.weixin.ShareCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping(value = "/shareCount")
public class ShareCountController extends GenericController{
    @Autowired
    private ShareCountService shareCountService;

    @RequestMapping(value = "/count")
    public @ResponseBody String count(@RequestBody ShareCount shareCount){
        shareCount.setCtime(System.currentTimeMillis());
        logger.info(String.valueOf(shareCount.getCtime()));
        logger.info(String.valueOf(shareCount.getContentId()));
        logger.info(String.valueOf(shareCount.getShareType()));
        logger.info(String.valueOf(shareCount.getOpenId()));
        int i = 0;
        try {
            i = shareCountService.insertCount(shareCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(0!=i){
            return "分享成功";
        }else {
            return "已经分享过";
        }
    }
}
