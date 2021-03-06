package com.zjsm.ctms.idao;

import java.util.ArrayList;

import com.zjsm.ctms.model.Employee;

/**
 * 定义对用户表的增删改查接口
 * @author 张荣
 */
public interface IEmployee
{
    // 增
    public boolean insert(Employee employee);

    // 删
    public boolean delete(String employeeNo);

    // 改
    public boolean update(Employee employee);

    // 查所有用户(一般用于和界面交互)
    public ArrayList<Employee> findEmployeeAll();

    // 根据用户名查(一般用于和界面交互)
    public ArrayList<Employee> findEmployeeByName(String employeeName);

    // 根据用户id查(一般用于数据内部关联操作)
    public Employee findEmployeeById(int employeeId);
    
    // 根据用户名获取用户信息(一般用于数据内部关联操作)
    public Employee findUserByNo(String empNo);
}
