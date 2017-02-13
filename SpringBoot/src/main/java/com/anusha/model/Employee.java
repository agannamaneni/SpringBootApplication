package com.anusha.model;

import org.springframework.beans.factory.parsing.EmptyReaderEventListener;

/**
 * Created by anusha on 1/3/17.
 */
public class Employee {
    private int id;
    private String name;
    private String role;

    public Employee(){

    }

    public Employee(int id, String name, String role){
        this.role = role;
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
