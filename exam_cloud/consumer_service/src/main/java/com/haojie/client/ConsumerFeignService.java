package com.haojie.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "provider-service")
public interface ConsumerFeignService {

    @RequestMapping("provider/users")
    public Object list();
}
