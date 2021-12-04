package com.os.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Dept {
    private long deptno;   //部门编号
    private String dname;  //部门名称
    private String db_source;  //来自那个数据库
}
