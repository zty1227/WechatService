package com.jackson.service.weixin.impl;

import com.jackson.dao.WeixinUserInfoMapper;
import com.jackson.entity.WeixinUserInfo;
import com.jackson.entity.WeixinUserInfoExample;
import com.jackson.service.weixin.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhangtianyu on 2017/1/14.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    protected WeixinUserInfoMapper mapper;

    @Override
    public void saveUser(WeixinUserInfo weixinUserInfo) throws Exception {
        this.mapper.insert(weixinUserInfo);
    }

    @Override
    public WeixinUserInfo findById(Integer id) throws Exception {
        return this.mapper.selectByPrimaryKey(id);
    }

    @Override
    public WeixinUserInfo findByOpenId(String openId) throws Exception {
        return this.mapper.findByOpenId(openId);
    }

    @Override
    public void updateByOpenId(WeixinUserInfo weixinUserInfo) throws Exception {
        System.out.println("udpate");

        WeixinUserInfoExample weixinUserInfoExample = new WeixinUserInfoExample();
        WeixinUserInfoExample.Criteria criteria = weixinUserInfoExample.createCriteria();

        criteria.andOpenidEqualTo(weixinUserInfo.getOpenid());

        mapper.updateByExample(weixinUserInfo,weixinUserInfoExample);
    }

    @Override
    public int deleteByOpenId(String openId) throws Exception {
        System.out.println(openId);

        WeixinUserInfoExample weixinUserInfoExample = new WeixinUserInfoExample();

        WeixinUserInfoExample.Criteria criteria = weixinUserInfoExample.createCriteria();

        criteria.andOpenidEqualTo(openId);

        int i = mapper.deleteByExample(weixinUserInfoExample);

        return i;
    }

    @Override
    public List<WeixinUserInfo> findAllUser() throws Exception {
        return mapper.findAllUser();
    }

    @Override
    public List<WeixinUserInfo> findUserByIsZone(Boolean isZone) throws Exception {
        return mapper.findUserByIsZone(isZone);
    }

    @Override
    public List<WeixinUserInfo> findByArea(String area) throws Exception {
        return mapper.findByArea(area);
    }
}
