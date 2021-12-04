package com.os.springcloud.controller;

import com.os.springcloud.entities.Dept;
import com.os.springcloud.service.DeptClietService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController_Consumer {

    @Resource
    private DeptClietService deptClietService;

    //增加

    //删除

    //修改

    //查询
    @GetMapping("showDeptALLByFeign")
    public List<Dept> showDeptALLByFeign(){
        List<Dept> list = deptClietService.findAll();
        return list;
    }

}
