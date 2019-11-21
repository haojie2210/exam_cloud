package com.haojie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ：单击开始
 * @description：
 * @date ：Created in 2019/11/21 16:11
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ConsumerApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplicaiton.class,args);
    }
}
