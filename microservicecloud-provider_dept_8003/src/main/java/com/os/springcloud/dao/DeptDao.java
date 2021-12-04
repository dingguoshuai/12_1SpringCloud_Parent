package com.os.springcloud.dao;

import com.os.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    //增加

    //删除

    //修改

    //查询
    List<Dept> selectAll();
}
