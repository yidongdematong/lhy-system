package com.order.modules.design.dao;


import com.order.common.utils.Pager;
import com.order.common.utils.R;
import com.order.modules.design.entity.DesignEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface DesignEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DesignEntity record);

    int insertSelective(DesignEntity record);

    DesignEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DesignEntity record);

    int updateByPrimaryKey(DesignEntity record);

    List<DesignEntity> getDesignList(@Param("pager") Pager pager);

    int getDesignListCount();
}