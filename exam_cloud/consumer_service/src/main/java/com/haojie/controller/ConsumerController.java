package com.haojie.controller;

import com.haojie.client.ConsumerFeignService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：单击开始
 * @description：
 * @date ：Created in 2019/11/21 18:02
 */
@RestController
@RequestMapping("/consumer/")
@CrossOrigin
public class ConsumerController {

    @Autowired
    private ConsumerFeignService consumerFeignService;

    @RequestMapping("user/list")
    public Object list(){
        return consumerFeignService.list();
    }
}
