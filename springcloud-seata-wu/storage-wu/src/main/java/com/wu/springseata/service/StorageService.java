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
public class StorageService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void deduct(String commodityCode, int count) {
        jdbcTemplate.update("update storage_tbl set count = count - ? where commodity_code = ?",
            new Object[] {count, commodityCode});
    }

    public Map<String, Object> findByCode(String commodityCode) {
       return  jdbcTemplate.queryForMap("select * from storage_tbl where commodity_code= ?",
                new Object[] {commodityCode});
    }
}
