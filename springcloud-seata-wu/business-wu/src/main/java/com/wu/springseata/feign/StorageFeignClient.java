package com.wu.springseata.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author wusikun
 * @date 2020/7/26
 */
@FeignClient(name = "storage-service", url = "127.0.0.1:8081")
public interface StorageFeignClient {

    @GetMapping("/deduct")
    void deduct(@RequestParam("commodityCode") String commodityCode,
                @RequestParam("count") Integer count);

    @GetMapping("/findByCode")
    Map<String,Object> findByCode(@RequestParam("commodityCode") String commodityCode);
}
