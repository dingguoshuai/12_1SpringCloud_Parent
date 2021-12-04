package com.os.springcloud.service.impl;

import com.os.springcloud.dao.DeptDao;
import com.os.springcloud.entities.Dept;
import com.os.springcloud.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    //需要数据访问层的接口对象
    @Resource
    private DeptDao deptDao;

    //增加

    //删除

    //修改

    //查询
    @Override
    public List<Dept> findAll() {
        List<Dept> list = deptDao.selectAll();
        return list;
    }
}
