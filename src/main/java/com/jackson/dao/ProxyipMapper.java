package com.jackson.dao;

import com.jackson.entity.Proxyip;
import com.jackson.entity.ProxyipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProxyipMapper {
    long countByExample(ProxyipExample example);

    int deleteByExample(ProxyipExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Proxyip record);

    int insertSelective(Proxyip record);

    List<Proxyip> selectByExample(ProxyipExample example);

    Proxyip selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Proxyip record, @Param("example") ProxyipExample example);

    int updateByExample(@Param("record") Proxyip record, @Param("example") ProxyipExample example);

    int updateByPrimaryKeySelective(Proxyip record);

    int updateByPrimaryKey(Proxyip record);
}