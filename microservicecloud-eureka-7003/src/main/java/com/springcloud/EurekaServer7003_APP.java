package com.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003_APP {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServer7003_APP.class).web(true).run(args);
    }
}
