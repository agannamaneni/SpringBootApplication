package com.anusha.controller;

import com.anusha.model.Employee;
import com.anusha.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

/**
 * Created by anusha on 1/3/17.
 */
@Controller
@RefreshScope
@RequestMapping("/employees")
public class EmployeeController {

    @Value("${messages.welcomeMsg}")
    private String welcomeMsg;

    @Autowired
    EmployeeService empService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody()
    public Collection<Employee> getAllEmployees(){
        return empService.getAllEmployees();
    }

    @RequestMapping(value = "/{id}", method=RequestMethod.GET)
    @ResponseBody
    public Employee getEmployeeById(@PathVariable("id") int id){
        return empService.getEmployeeById(id);
    }

    @RequestMapping(value = "/{id}", method=RequestMethod.DELETE)
    @ResponseBody
    public void deleteEmployeeById(@PathVariable("id") int id){
        empService.deleteEmployeeById(id);
    }

    @RequestMapping(method=RequestMethod.PUT, consumes= MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void updateEmployee(@RequestBody Employee employee){
        empService.updateEmployee(employee);
    }


    @RequestMapping("/welcomeMsg")
    public ResponseEntity<?> welcome(){
        return new ResponseEntity<>(welcomeMsg, HttpStatus.OK);
    }
}
