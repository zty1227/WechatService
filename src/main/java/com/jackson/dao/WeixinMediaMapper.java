package com.jackson.dao;

import com.jackson.entity.WeixinMedia;
import com.jackson.entity.WeixinMediaExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeixinMediaMapper {
    long countByExample(WeixinMediaExample example);

    int deleteByExample(WeixinMediaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeixinMedia record);

    int insertSelective(WeixinMedia record);

    List<WeixinMedia> selectByExample(WeixinMediaExample example);

    WeixinMedia selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeixinMedia record, @Param("example") WeixinMediaExample example);

    int updateByExample(@Param("record") WeixinMedia record, @Param("example") WeixinMediaExample example);

    int updateByPrimaryKeySelective(WeixinMedia record);

    int updateByPrimaryKey(WeixinMedia record);
}