package com.jackson.service.weibo;

import com.jackson.entity.WeiboData;

import java.util.List;

/**
 * Created by zhangtianyu on 2017/3/8.
 */
public interface WbDataService {

    public void save(WeiboData weiboData)throws Exception;

    public List<WeiboData> findAll()throws Exception;
}
