package com.os.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.os.springcloud"})
public class DeptConsumerFeign_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign_APP.class,args);
    }
}
