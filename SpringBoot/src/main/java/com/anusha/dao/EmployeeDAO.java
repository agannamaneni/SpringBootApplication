package com.anusha.dao;

import com.anusha.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by anusha on 1/3/17.
 */
@Repository
public class EmployeeDAO {

    private static Map<Integer, Employee> employees;

    static {
        employees = new HashMap<Integer, Employee>(){
            {
                put(1, new Employee(1, "Kate", "Engineer"));
                put(2, new Employee(2, "James", "Manager"));
                put(3, new Employee(3, "Dave", "Director"));
            }
        };
    }

    public Collection<Employee> getAllEmployees()
    {
        return this.employees.values();
    }

    public Employee getEmployeeById(int id){
        return this.employees.get(id);
    }

    public void deleteEmployeeById(int id){
        this.employees.remove(id);
    }

    public void updateEmployee(Employee employee){
        this.employees.put(employee.getId(), employee);
    }
}
