package com.wu.springseata.controller;

import com.wu.springseata.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author wu
 * @date 2020/7/25
 */
@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/reduce", produces = "application/json")
    public Boolean debit(String userId, int money) {
        accountService.reduce(userId, money);
        return true;
    }

    @RequestMapping(value = "/findByUserId", produces = "application/json")
    public Map<String,Object> findByUserId(String userId) {
        Map<String, Object> byId = accountService.findById(userId);
        return byId;
    }
}
