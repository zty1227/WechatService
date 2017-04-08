package com.jackson.dao;

import com.jackson.entity.WeiboData;
import com.jackson.entity.WeiboDataExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeiboDataMapper {
    long countByExample(WeiboDataExample example);

    int deleteByExample(WeiboDataExample example);

    int deleteByPrimaryKey(String contentid);

    int insert(WeiboData record);

    int insertSelective(WeiboData record);

    List<WeiboData> selectByExample(WeiboDataExample example);

    WeiboData selectByPrimaryKey(String contentid);

    int updateByExampleSelective(@Param("record") WeiboData record, @Param("example") WeiboDataExample example);

    int updateByExample(@Param("record") WeiboData record, @Param("example") WeiboDataExample example);

    int updateByPrimaryKeySelective(WeiboData record);

    int updateByPrimaryKey(WeiboData record);

    List<WeiboData> findAll();

    WeiboData findByContentId(String contentid);

    List<WeiboData> findByZone(String zone);

    List<WeiboData> findByIscheck(Boolean ischeck);

    List<WeiboData> findByZoneAndIscheck(@Param(value = "zone") String zone, @Param(value = "ischeck") boolean ischeck);

}