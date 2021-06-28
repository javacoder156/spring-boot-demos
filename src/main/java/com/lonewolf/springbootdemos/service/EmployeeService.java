package com.lonewolf.springbootdemos.service;

import com.lonewolf.springbootdemos.model.Employee;

import java.util.List;

public interface EmployeeService {

    public abstract Employee createEmployee(Employee employee);
    public abstract Employee getEmployeeById(long id);
    public abstract List<Employee> getAllEmployee();
    public abstract boolean updateEmployee(Employee updatedEmployee,long id);
    public abstract void deleteEmployee(long id);



}
