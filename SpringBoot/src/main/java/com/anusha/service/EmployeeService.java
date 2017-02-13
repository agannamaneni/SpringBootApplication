package com.anusha.service;

import com.anusha.dao.EmployeeDAO;
import com.anusha.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by anusha on 1/3/17.
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeDAO empDAO;

    public Collection<Employee> getAllEmployees(){
        return empDAO.getAllEmployees();
    }

    public Employee getEmployeeById(int id){
        return empDAO.getEmployeeById(id);
    }

    public void deleteEmployeeById(int id){
        empDAO.deleteEmployeeById(id);
    }

    public void updateEmployee(Employee employee){
        empDAO.updateEmployee(employee);
    }
}
