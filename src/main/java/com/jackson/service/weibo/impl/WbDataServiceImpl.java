package com.jackson.service.weibo.impl;

import com.jackson.dao.WeiboDataMapper;
import com.jackson.entity.WeiboData;
import com.jackson.entity.WeiboDataExample;
import com.jackson.service.weibo.WbDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangtianyu on 2017/3/8.
 */
@Service
public class WbDataServiceImpl implements WbDataService {

    @Autowired
    protected WeiboDataMapper mapper;

    @Override
    public void save(WeiboData weiboData) throws Exception {
        this.mapper.insert(weiboData);
    }

    @Override
    public List<WeiboData> findAll() throws Exception {
        return this.mapper.findAll();
    }

    @Override
    public WeiboData findByContentId(String contentId) throws Exception {
        return this.mapper.findByContentId(contentId);
    }

    @Override
    public void updateByContentId(WeiboData weiboData) throws Exception {

        WeiboDataExample weiboDataExample = new WeiboDataExample();
        WeiboDataExample.Criteria criteria = weiboDataExample.createCriteria();

        criteria.andContentidEqualTo(weiboData.getContentid());

        mapper.updateByExample(weiboData, weiboDataExample);
    }


}
