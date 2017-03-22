package com.jackson.spider;


import com.jackson.entity.WeiboData;
import org.jsoup.select.Elements;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by zhangtianyu on 2017/3/1.
 */
public class WeiboFriendsProcessor implements PageProcessor {

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
                    .setUserAgent(UserAgentUtils.radomUserAgent())
                    .setRetryTimes(3).setSleepTime(1000);


    @Override
    public void process(Page page) {
        Map<String, String> map = new HashMap<>();
        map.put("贵州省旅游发展委员会", "贵州");
        map.put("贵州旅游广播", "贵州");
        map.put("幸福的贵州", "贵州");
        map.put("云南旅游", "云南");
        map.put("云南旅游发布厅", "云南");
        map.put("人间净土喀纳斯", "新疆");
        map.put("大美新疆-", "新疆");
        map.put("新疆是个好地方V", "新疆");
        map.put("新浪黑龙江旅游", "黑龙江");
        map.put("黑龙江省旅游发展委员会", "黑龙江");
        map.put("哈尔滨市旅游局", "黑龙江");
        map.put("河北省旅游发展委员会", "河北");
        map.put("秦皇岛市旅游委员会", "河北");
        map.put("河南旅游", "河南");
        map.put("河南省旅游局官方微博", "河南");
        map.put("河南旅游新生活杂志", "河南");
        map.put("西藏旅游杂志社", "西藏");
        map.put("西藏拉萨旅行攻略", "西藏");
        map.put("西藏全攻略", "西藏");
        map.put("三亚旅游官方网", "海南");
        map.put("山东省旅游发展委员会", "山东");
        map.put("山东省旅游信息中心", "山东");
        map.put("青岛市旅游发展委员会官方微博", "山东");
        map.put("山西省旅游局官方微博", "山西");
        map.put("新浪山西旅游", "山西");
        map.put("新浪江苏旅游", "江苏");
        map.put("昆山旅游度假区", "江苏");
        map.put("江苏微旅游", "江苏");
        map.put("杭州市旅游委员会", "浙江");
        map.put("浙江省旅游局", "浙江");
        map.put("宁波旅游局", "浙江");
        map.put("新浪浙江旅游", "浙江");
        map.put("舟山市旅游委员会", "浙江");
        map.put("千湖岛旅游", "浙江");
        map.put("江西风景独好", "江西");
        map.put("中国最美的乡村婺源", "江西");
        map.put("江西旅游", "江西");
        map.put("江西赣州旅游", "江西");
        map.put("乐游广东", "广东");
        map.put("广州旅游", "广东");
        map.put("东莞旅游局", "广东");
        map.put("广西旅游发展委员会", "广西");
        map.put("桂林最新资讯", "广西");
        map.put("重庆市旅游局", "四川");
        map.put("四川旅游", "四川");
        map.put("浪迹四川", "四川");
        map.put("幸福成都", "四川");
        map.put("湖南省旅游发展委员会", "湖南");
        map.put("新浪湖南", "湖南");
        map.put("张家界百龙天梯", "湖南");
        map.put("湖南旅游", "湖南");
        map.put("陕西省旅游局", "陕西");
        map.put("陕西旅游", "陕西");
        map.put("西安市旅游局", "陕西");
        map.put("湖北旅游", "湖北");
        map.put("武汉市旅游局", "湖北");
        map.put("湖北省旅游发展委员会", "湖北");
        map.put("湖北旅游百事通", "湖北");
        map.put("武当山旅游局", "湖北");
        map.put("福建省旅游局", "福建");
        map.put("厦门鼓浪屿旅游攻略", "福建");
        map.put("厦门鼓浪屿旅游助手", "福建");
        map.put("厦门鼓浪屿攻略", "福建");
        map.put("厦门市旅游局", "福建");
        map.put("新浪福建旅游", "福建");
        map.put("海峡旅游", "福建");
        map.put("吉林省旅游发展委员会", "吉林");
        map.put("新浪吉林旅游", "吉林");
        map.put("长白山旅游官博", "吉林");
        map.put("安徽爱游", "安徽");
        map.put("安徽省旅游局", "安徽");
        map.put("旅游安徽", "安徽");
        map.put("宁夏旅游", "宁夏");
        map.put("宁夏旅游快报", "宁夏");
        map.put("新浪辽宁旅游", "辽宁");
        map.put("辽宁省旅游局", "辽宁");
        map.put("大美青海", "青海");
        map.put("鄂尔多斯旅游局", "内蒙古");
        map.put("美丽内蒙古", "内蒙古");
        map.put("内蒙古旅游局", "内蒙古");
        map.put("乐游上海", "上海");
        page.addTargetRequests(page.getHtml().xpath("//table/tbody/tr/td[2]/a[1]").links().all());
        page.addTargetRequests(page.getHtml().xpath("//div[@class='pa']/form/div/a[1]").links().regex("http://weibo\\.cn/.+?\\?page=[2-9]").all());
        Elements c = page.getHtml().getDocument().getElementsByClass("c");
//        page.putField("html", c);
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
            String zone = map.get(weiboname);
            List<WeiboData> weiboDataList = new ArrayList();
            for (int i = 2; i < c.size(); i++) {
                WeiboData weiboData = new WeiboData();
                String contentId = c.get(i - 2).attr("id");
                String content = c.get(i - 2).getElementsByClass("ctt").text();
                String imgUrl = c.get(i - 2).getElementsByTag("img").attr("src");
                String time = c.get(i - 2).getElementsByClass("ct").text();
                String zzp = c.get(i - 2).getElementsByTag("a").text().toString();
                if (zone != null) {
                    int endtime = time.indexOf("来");
                    time = time.substring(0, endtime);
                    if (time.startsWith("今") || time.contains("前")) {
                        Date day = new Date();
                        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        time = df.format(day);
                    }
                    if (time.contains("月")) {
                        String time1 = time.replace("月", "-");
                        time1 = time1.replace("日", "");
                        time1 = time1.substring(0, time.length() - 2);
                        String year = "2017-";
                        String second = ":00";
                        time = year + time1 + second;
                    }
                    zzp = zzp.substring(zzp.indexOf("赞"), zzp.length());
                    Integer zan = Integer.parseInt(zzp.substring(2, zzp.indexOf("转") - 2));
                    Integer zhuanfa = Integer.parseInt(zzp.substring(zzp.indexOf("发") + 2, zzp.indexOf("评") - 2));
                    Integer pinglun = Integer.parseInt(zzp.substring(zzp.indexOf("论") + 2, zzp.indexOf("收") - 2));
                    weiboData.setZan(zan);
                    weiboData.setZhuanfa(zhuanfa);
                    weiboData.setPinglun(pinglun);
                }
                weiboData.setContentid(contentId);
                weiboData.setContent(content);
                weiboData.setImgurl(imgUrl);
                weiboData.setTime(time);
                weiboData.setWeiboname(weiboname);
                weiboData.setZone(zone);
                weiboData.setIscheck(false);
//                System.out.println(weiboData.toString());
                weiboDataList.add(weiboData);
            }
            page.putField("weiboDataList", weiboDataList);
        }
    }


    @Override
    public Site getSite() {
        return site;
    }
}
