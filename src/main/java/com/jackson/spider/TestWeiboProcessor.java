package com.jackson.spider;

import com.jackson.entity.WeiboData;
import org.jsoup.select.Elements;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.processor.PageProcessor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangtianyu on 2017/3/9.
 */
public class TestWeiboProcessor implements PageProcessor {
    private Site site =
            Site.me().setDomain("weibo.cn")
                    .setCharset("utf-8")
                    .addHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:49.0) Gecko/20100101 Firefox/49.0")
                    .addHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,**/*//*;q=0.8")
                    .addHeader("Accept-Encoding", "gzip, deflate")
                    .addCookie("PHPSESSID", "4ab38ccc90503e13816d31317d1a8546")
                    .addCookie("_T_WM", "9fee27c3c193540ae5b8af4e084791ff")
                    .addCookie("SUB", "_2A251sx22DeRxGeBP7lYW8irMzDiIHXVXX6P-rDV6PUJbkdANLRHSkW2QlM3kaVCF-DnTkoqBga86Y0HCWA..")
                    .addCookie("gsid_CTandWM", "4uG37d1d12Kpxb5ELqe1VpP7K1c")
//                    .setUserAgent(UserAgentUtils.radomUserAgent())
//                    .setHttpProxy(new HttpHost("183.32.88.18", 808))
                    .setRetryTimes(3).setSleepTime(1000);


    @Override
    public void process(Page page) {
        page.addTargetRequests(page.getHtml().xpath("//table/tbody/tr/td[2]/a[1]").links().all());
        page.addTargetRequests(page.getHtml().xpath("//div[@class='pa']/form/div/a[1]").links().regex("http://weibo\\.cn/.+?\\?page=[2-9]").all());
        Elements c = page.getHtml().getDocument().getElementsByClass("c");
        String weibo1 = page.getHtml().xpath("//div[@class='ut']/span[@class='ctt']/text()").get();
        String weibo2 = page.getHtml().xpath("//div[@class='ut']/text()").get();
        String weiboname = "";
        if (null != weibo1 || null != weibo2) {
            if (null != weibo1 && null != weibo2) {
                weibo2 = null;
            }
            if (null != weibo1) {
                int end1 = weibo1.indexOf("/") - 2;
                weiboname = weibo1.substring(0, end1);

            }
            if (null != weibo2) {
                int end2 = weibo2.indexOf("的");
                weiboname = weibo2.substring(0, end2);
            }
            List<WeiboData> weiboDataList = new ArrayList();
            for (int i = 2; i < c.size(); i++) {
                WeiboData weiboData = new WeiboData();
                String contentId = c.get(i - 2).attr("id");
                String content = c.get(i - 2).getElementsByClass("ctt").text();
                String imgUrl = c.get(i - 2).getElementsByTag("img").attr("src");
                weiboData.setContentid(contentId);
                weiboData.setContent(content);
                weiboData.setImgurl(imgUrl);
                weiboData.setWeiboname(weiboname);
                System.out.println(weiboData.toString());
                weiboDataList.add(weiboData);
            }
            page.putField("weiboDataList", weiboDataList);
        }
    }


    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {

        Spider.create(new TestWeiboProcessor())
                .addUrl("http://weibo.cn/6160517394/follow")
//                .addUrl("http://weibo.cn/hblyj?page=3")
                .addPipeline(new ConsolePipeline())
                .thread(5)
                .run();
    }
}