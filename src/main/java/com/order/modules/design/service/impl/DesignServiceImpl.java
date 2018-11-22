package com.order.modules.design.service.impl;

import com.order.common.utils.Pager;
import com.order.common.utils.R;
import com.order.modules.design.dao.DesignEntityMapper;
import com.order.modules.design.entity.DesignEntity;
import com.order.modules.design.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DesignServiceImpl implements DesignService {

    @Autowired
    private DesignEntityMapper designEntityMapper;

    @Override
    public R addDesignEntity(DesignEntity entity) {

        Boolean flag = designEntityMapper.insertSelective(entity) > 0;
        if (flag) {
            return R.ok("新增成功");
        } else {
            return R.error(1, "新增失败");
        }

    }

    @Override
    public R getDesignList(Pager pager) {
        List<DesignEntity> dataList = designEntityMapper.getDesignList(pager);
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("data", dataList);
        dataMap.put("count", designEntityMapper.getDesignListCount());
        return R.ok(dataMap);
    }

    @Override
    public R deleted(DesignEntity designEntity) {
        Boolean flag = designEntityMapper.deleteByPrimaryKey(designEntity.getId()) > 0;
        if (flag) {
            return R.ok("删除成功");
        } else {
            return R.error(1, "删除失败");
        }
    }
}
