package com.wu.springseata.controller;

import com.wu.springseata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wusikun
 * @date 2019/06/14
 */

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/create", produces = "application/json")
    public Boolean create(String userId, String commodityCode, Integer count) {

        orderService.create(userId, commodityCode, count);
        System.out.println("OrderControllerOrderControllerOrderControllerOrderControllerOrderController");
        return true;
    }

}
