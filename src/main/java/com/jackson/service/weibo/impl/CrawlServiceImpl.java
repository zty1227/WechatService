package com.jackson.service.weibo.impl;

import com.jackson.service.weibo.CrawlService;
import com.jackson.spider.WeiboFriendsPipeline;
import com.jackson.spider.WeiboFriendsProcessor;
import org.springframework.stereotype.Service;
import us.codecraft.webmagic.Spider;

import javax.annotation.Resource;

/**
 * Created by zhangtianyu on 2017/3/8.
 */
@Service
public class CrawlServiceImpl implements CrawlService {
    @Resource
    protected WeiboFriendsPipeline weiboFriendsPipeline;
    @Override
    public void weiboCrawl() {
        Spider.create(new WeiboFriendsProcessor())
                .addUrl("http://weibo.cn/6160517394/follow")
                .addPipeline(weiboFriendsPipeline)
                .thread(5)
                .run();

    }
}
