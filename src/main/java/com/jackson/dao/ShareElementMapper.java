package com.jackson.dao;

import com.jackson.entity.ShareElement;
import com.jackson.entity.ShareElementExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShareElementMapper {
    int countByExample(ShareElementExample example);

    int deleteByExample(ShareElementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShareElement record);

    int insertSelective(ShareElement record);

    List<ShareElement> selectByExample(ShareElementExample example);

    ShareElement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShareElement record, @Param("example") ShareElementExample example);

    int updateByExample(@Param("record") ShareElement record, @Param("example") ShareElementExample example);

    int updateByPrimaryKeySelective(ShareElement record);

    int updateByPrimaryKey(ShareElement record);
}