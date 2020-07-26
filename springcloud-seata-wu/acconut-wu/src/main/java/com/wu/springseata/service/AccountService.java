package com.wu.springseata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author wu
 * @date 2020/7/26
 */
@Service
public class AccountService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void reduce(String userId, int money) {
        jdbcTemplate.update("update account_tbl set money = money - ? where user_id = ?", new Object[] {money, userId});
    }

    public Map<String,Object> findById(String userId) {
        return jdbcTemplate.queryForMap("select * from account_tbl where user_id= ?",new Object[] {userId});
    }
}
