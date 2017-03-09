package com.jackson.service.weixin;

import com.jackson.entity.WeixinUserInfo;

import java.util.List;

/**
 * Created by zhangtianyu on 2017/1/14.
 */
public interface UserInfoService {

    public void saveUser(WeixinUserInfo weixinUserInfo)throws Exception;

    public WeixinUserInfo findById(Integer id)throws Exception;

    public WeixinUserInfo findByOpenId(String openId)throws Exception;

    public void updateByOpenId(WeixinUserInfo weixinUserInfo)throws Exception;

    public int deleteByOpenId(String openId)throws Exception;

    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    public List<WeixinUserInfo> findAllUser() throws Exception;

    /**
     * 查找所有未分区的用户
     */

    public List<WeixinUserInfo> findUserByIsZone(Boolean isZone) throws Exception;

    /**
     * 根据用户分区信息查找用户
     */
    public List<WeixinUserInfo> findByArea(String area)throws Exception;


}
