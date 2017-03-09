package com.jackson.spider;

import com.jackson.entity.WeiboData;
import com.jackson.service.weibo.WbDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.List;

/**
 * Created by zhangtianyu on 2017/3/8.
 */
@Component
public class WeiboFriendsPipeline implements Pipeline {

    public static int size = 0;

    @Autowired
    protected WbDataService wbDataService;


    @Override
    public void process(ResultItems resultItems, Task task) {
        List<WeiboData> weiboDataList = resultItems.get("weiboDataList");
        for(int i=0;i<weiboDataList.size();i++){
            try {
                if (wbDataService.findByContentId(weiboDataList.get(i).getContentid()) != null) {
                    wbDataService.updateByContentId(weiboDataList.get(i));
                } else {
//                    System.out.println("save");

                    wbDataService.save(weiboDataList.get(i));
                    size++;

                    System.out.println(size);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
