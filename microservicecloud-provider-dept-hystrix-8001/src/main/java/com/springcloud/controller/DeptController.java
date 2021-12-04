package com.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.os.springcloud.entities.Dept;
import com.springcloud.service.DeptService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController {

    @Resource
    private DeptService deptService = null;


    @RequestMapping(value = "dept/get/{id}", method= RequestMethod.GET)
    //一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
    @HystrixCommand(fallbackMethod = "processHystrix_id")
    public Dept getDeptById(@PathVariable("id") long id){

        Dept dept = this.deptService.findById(id);
        if (null == dept){
            throw  new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }
        return dept;
    }

    @GetMapping(value = "getDept")
    public List<Dept> getDept(){
        List<Dept> list = this.deptService.findAll();
        return list;
    }

    /**
     * 当要查询的编号，在数据库中没有对象的信息时，调用该方法
     */

    public Dept processHystrix_id(@PathVariable("id") long id){
        return new Dept().setDeptno(id).setDname("该ID：" + id + "没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }

}
