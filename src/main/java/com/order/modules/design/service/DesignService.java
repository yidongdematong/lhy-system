package com.order.modules.design.service;

import com.order.common.utils.Pager;
import com.order.common.utils.R;
import com.order.modules.design.entity.DesignEntity;

public interface DesignService {


    R addDesignEntity(DesignEntity entity);

    R getDesignList(Pager pager);

    R deleted(DesignEntity designEntity);
}
