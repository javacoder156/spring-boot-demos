package com.lonewolf.springbootdemos.service;

import com.lonewolf.springbootdemos.model.Employee;
import com.lonewolf.springbootdemos.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Autowired
    EmployeeRepository employeeRepository;


    @Override
    public Employee createEmployee(Employee employee) {
        logger.debug("inside EmployeeServiceImpl.createEmployee method");
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        logger.debug("inside EmployeeServiceImpl.getEmployeeById method");

        Optional< Employee > optional = employeeRepository.findById(id);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException(" Employee not found for id :: " + id);
        }
        return employee;
    }

    @Override
    public List<Employee> getAllEmployee() {
        logger.debug("inside EmployeeServiceImpl.getAllEmployee method");
        return null;
    }

    @Override
    public boolean updateEmployee(Employee updatedEmployee, long id) {
        logger.debug("inside EmployeeServiceImpl.updateEmployee method");
        return false;
    }

    @Override
    public void deleteEmployee(long id) {
        logger.debug("inside EmployeeServiceImpl.deleteEmployee method");
        employeeRepository.deleteById(id);
    }
}
