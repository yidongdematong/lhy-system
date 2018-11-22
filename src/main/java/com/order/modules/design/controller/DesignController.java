package com.order.modules.design.controller;

import com.order.common.utils.Pager;
import com.order.common.utils.R;
import com.order.modules.design.entity.DesignEntity;
import com.order.modules.design.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("design")
public class DesignController {


    @Autowired
    private DesignService designService;

    @PostMapping("add")
    public R designDetail(@RequestBody DesignEntity entity) {
        return designService.addDesignEntity(entity);
    }

    @PostMapping("lists")
    public R getDesignList(@RequestBody Map<String, Object> pager) {

        return designService.getDesignList(new Pager(pager));
    }

    @PostMapping("deleted")
    public R deleted(@RequestBody DesignEntity designEntity) {
        return designService.deleted(designEntity);
    }
}
