package com.haojie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author ：单击开始
 * @description：
 * @date ：Created in 2019/11/19 16:49
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @RequestMapping("/users")
    public Object list(){
        return Arrays.asList("张三","李四","王五");
    }
}
