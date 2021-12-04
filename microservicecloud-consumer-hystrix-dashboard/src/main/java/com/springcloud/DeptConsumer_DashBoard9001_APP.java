package com.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard9001_APP {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DeptConsumer_DashBoard9001_APP.class).web(true).run(args);
    }
}
