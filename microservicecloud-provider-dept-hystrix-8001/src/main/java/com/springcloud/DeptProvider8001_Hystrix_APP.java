package com.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //本服务启动后会自动注册eureka服务中
@EnableDiscoveryClient  //服务发现
@EnableCircuitBreaker  //对hystrix熔断机制的支持
public class DeptProvider8001_Hystrix_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_Hystrix_APP.class,args);
        /*String property = run.getEnvironment().getProperty("server.port");
        log.info("Http://localhost:"+property+"/访问路径/");*/

    }
}
