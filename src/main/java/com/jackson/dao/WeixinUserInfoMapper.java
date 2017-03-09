package com.jackson.dao;

import com.jackson.entity.WeixinUserInfo;
import com.jackson.entity.WeixinUserInfoExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface WeixinUserInfoMapper {
    long countByExample(WeixinUserInfoExample example);

    int deleteByExample(WeixinUserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeixinUserInfo record);

    int insertSelective(WeixinUserInfo record);

    List<WeixinUserInfo> selectByExample(WeixinUserInfoExample example);

    WeixinUserInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeixinUserInfo record, @Param("example") WeixinUserInfoExample example);

    int updateByExample(@Param("record") WeixinUserInfo record, @Param("example") WeixinUserInfoExample example);

    int updateByPrimaryKeySelective(WeixinUserInfo record);

    int updateByPrimaryKey(WeixinUserInfo record);

    WeixinUserInfo findByOpenId(String openId);

    List<WeixinUserInfo> findAllUser();

    List<WeixinUserInfo> findUserByIsZone(boolean isZone);

    List<WeixinUserInfo> findByArea(String area);
}