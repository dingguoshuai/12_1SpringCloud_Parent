package com.springcloud.service;

import com.os.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept findById(long id);

    public List<Dept> findAll();
}
