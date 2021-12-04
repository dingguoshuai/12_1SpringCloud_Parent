package com.os.springcloud.service;


import com.os.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 *实现负载均衡的主要接口
 */
@FeignClient(value = "dingguoshuaiAPP")
public interface DeptClietService {
    //增加

    //删除

    //修改

    //查询
    @RequestMapping("showDeptAll")
    List<Dept> findAll();
}
