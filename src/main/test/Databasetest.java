import com.jackson.entity.WeiboData;
import com.jackson.entity.WeixinMedia;
import com.jackson.entity.WeixinUserInfo;
import com.jackson.service.weibo.WbDataService;
import com.jackson.service.weixin.UserInfoService;
import com.jackson.service.weixin.WxMediaService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Databasetest {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    protected UserInfoService userInfoService;

    @Autowired
    protected WxMediaService wxMediaService;

    @Autowired
    protected WbDataService wbDataService;

    @Test
    public void inset() throws Exception {

        WeixinUserInfo weixinUserInfo = new WeixinUserInfo();
//        weixinUserInfo.setId(23);
        weixinUserInfo.setSubscribe(false);
//        System.out.println(weixinUserInfo.getSubscribe());
        weixinUserInfo.setOpenid("123");
//        System.out.println(weixinUserInfo.getOpenid());
        weixinUserInfo.setNickname("3");
        weixinUserInfo.setSex("");
        weixinUserInfo.setLanguage("4");
        weixinUserInfo.setCity("5");
        weixinUserInfo.setProvince("6");
        weixinUserInfo.setCountry("7");
        weixinUserInfo.setHeadimgurl("8");
         weixinUserInfo.setSubscribetime(System.currentTimeMillis());
        weixinUserInfo.setUnionid("null");
        weixinUserInfo.setRemark("10");
        weixinUserInfo.setGroupid(1);
        weixinUserInfo.setIszone(false);
        weixinUserInfo.setArea("湖北");
//        System.out.println(weixinUserInfo.toString());
//        userInfoService.saveUser(weixinUserInfo);
//
//        logger.info("user的增加信息测试" + weixinUserInfo.toString());
//
//        WeixinUserInfo weixinUserInfo1 = userInfoService.findById(1);
//        logger.info("user的查找信息测试" + weixinUserInfo1.toString());
//        WeixinUserInfo weixinUserInfo2 = userInfoService.findByOpenId("1234");
//        userInfoService.updateByOpenId(weixinUserInfo);
//        logger.info("user的查找信息测试" + weixinUserInfo2.toString());
        userInfoService.saveUser(weixinUserInfo);
    }

    @Test
    public void insert1()throws Exception{
        WeixinMedia weixinMedia = new WeixinMedia();
        weixinMedia.setOpenid("ozNThwgFiMEBWW0HZLU4u0f8ubew");
        weixinMedia.setType("image");
        weixinMedia.setMediaid("1z10_KCqHTnNDNrEUolBTCKmzr1iMCDQwTtnUSIIOP--q54ha_K01QiRGZEVgO2o");
        weixinMedia.setCreatat(System.currentTimeMillis());
        weixinMedia.setTmp("1");
        wxMediaService.saveMeida(weixinMedia);
    }
    @Test
    public void findAlluser()throws Exception{
        List<WeixinUserInfo> weixinUserInfos = userInfoService.findAllUser();
        for(int i =0 ; i < weixinUserInfos.size(); i ++ ){
            System.out.println(weixinUserInfos.get(i));
        }
    }
    @Test
    public void findUserByIsZone()throws Exception{
        List<WeixinUserInfo> weixinUserInfos = userInfoService.findUserByIsZone(false);
        for(int i =0 ; i < weixinUserInfos.size(); i ++ ){
            System.out.println(weixinUserInfos.get(i).toString());
        }
    }

    @Test
    public void findUserByArea()throws Exception{
        List<WeixinUserInfo> weixinUserInfos = userInfoService.findByArea("湖北");
        for(int i =0 ; i < weixinUserInfos.size(); i ++ ){
            System.out.println(weixinUserInfos.get(i).toString());
        }
    }

    @Test
    public void saveweibo()throws Exception{
        WeiboData weiboData = new WeiboData();
        weiboData.setContentid("sdfasf");
        weiboData.setContent("asfdafdf");
        weiboData.setImgurl("httpasdfaf");
        weiboData.setWeiboname("旅游");
        wbDataService.save(weiboData);
    }

    @Test
    public void findAll()throws Exception{
        List<WeiboData> weiboDataList = wbDataService.findAll();
        for(int i=0;i<weiboDataList.size();i++){
            System.out.println(weiboDataList.get(i).toString());
        }
    }

    @Test
    public void findByContentId() throws Exception {
        String bi = "M_ExDrcCwRj";
        WeiboData test = wbDataService.findByContentId(bi);
        if (bi.equals(test.getContentid())) {
            System.out.println("1");
        }
        System.out.println(test.toString());
    }


    @Test
    public void findByZone() throws Exception {
        String zone = "湖北";
        List<WeiboData> weiboDataList = wbDataService.findByZone(zone);
        for (int i = 0; i < weiboDataList.size(); i++) {
            System.out.println(weiboDataList.get(i).toString());
        }
    }
}