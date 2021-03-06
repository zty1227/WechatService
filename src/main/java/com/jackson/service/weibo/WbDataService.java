package com.jackson.service.weibo;

import com.jackson.entity.WeiboData;

import java.util.List;

/**
 * Created by zhangtianyu on 2017/3/8.
 */
public interface WbDataService {

    public void save(WeiboData weiboData)throws Exception;

    public List<WeiboData> findAll()throws Exception;

    public WeiboData findByContentId(String contentId) throws Exception;

    public void updateByContentId(WeiboData weiboData) throws Exception;

    public List<WeiboData> findByZone(String zone) throws Exception;

    public List<WeiboData> findByIscheck(boolean ischeck) throws Exception;

    public List<WeiboData> findByZoneAndIscheck(String zone, boolean ischeck) throws Exception;
}
