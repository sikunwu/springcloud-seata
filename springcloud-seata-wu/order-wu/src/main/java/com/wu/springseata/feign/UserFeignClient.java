package com.wu.springseata.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wusikun
 * @date 2019/06/14
 */
@FeignClient(name = "account-service", url = "127.0.0.1:8083")
public interface UserFeignClient {

    @GetMapping("/reduce")
    Boolean reduce(@RequestParam("userId") String userId, @RequestParam("money") int money);
}
