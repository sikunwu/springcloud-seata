package com.wu.springseata.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author wusikun
 * @date 2020/7/26
 */
@FeignClient(name = "account-service", url = "127.0.0.1:8083")
public interface AccountFeignClient {

    @GetMapping("/create")
    void create(@RequestParam("userId") String userId,
                @RequestParam("commodityCode") String commodityCode,
                @RequestParam("count") Integer count);

    @GetMapping("/findByUserId")
    Map<String,Object> findByUserId(@RequestParam("userId") String userId);

}
