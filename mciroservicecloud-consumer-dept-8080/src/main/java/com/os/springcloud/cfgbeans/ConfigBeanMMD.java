package com.os.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Configuration把当前类交给Spring框架管理
 */
@Configuration
public class ConfigBeanMMD {

    //把当前方法交给Spring框架管理，并且创建完对象存放到Spring中
    @Bean
    @LoadBalanced  //开启负载均衡的功能
    public RestTemplate getRestTemplateDgs(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

    @Bean
    public IRule dgsRule(){
        RandomRule iRule = new RandomRule();
        return iRule;

    }

    public static void main(String[] args) {

    }
}
