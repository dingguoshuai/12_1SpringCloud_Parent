package com.os.springcloud.controller;

import com.os.springcloud.entities.Dept;
import com.os.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
/**
 * 控制器层
 * @RestController=@ResponseBody+@Controller
 */
@RestController
public class DeptController {
    //拿到业务逻辑层的接口对象
    @Autowired
    private DeptService deptService;

    //DiscoveryClient接口中包含已经封装的 获取服务信息的各种方法
    @Resource
    private DiscoveryClient dgsclient;

    //增加

    //删除

    //修改

    //查询
    @RequestMapping("showDeptAll")
    public List<Dept> showDeptAll(){
        List<Dept> list = deptService.findAll();
        return list;
    }

    /**
     * 拿到当前微服务的摘要信息
     */
    @RequestMapping("getServiceInfo")
    public Object getServiceInfo(){
        //需要通过一个对象来调用具体的服务方法
        List<String> list = dgsclient.getServices();
        //拿到当前的在Eureka中注册服务名称
        System.out.println("list:"+list);
        List<ServiceInstance> applist = dgsclient.getInstances("dingguoshuaiAPP");
        for (ServiceInstance si:applist) {
            System.out.println("si.getHost():"+si.getHost());
            System.out.println("si.getPort():"+si.getPort());
            System.out.println("+si.getServiceId():"+si.getServiceId());
            System.out.println("si.getUri():"+si.getUri());
            System.out.println("si.getMetadata():"+si.getMetadata());
        }
        return this.dgsclient;
    }
}
