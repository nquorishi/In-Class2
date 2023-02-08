/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inclass2;

/**
 *
 * @author Naweed
 */
public class Employee {
    // instance variables
    private String fname;
    private String lname;
    private double salary;

    public Employee() {
        fname = "none";
        lname = "none";
        salary = 0.0;
    }
    
    public Employee (String fn, String ln, Double sal) {
        fname = fn;
        lname = ln;
        salary = sal;
    }
    
    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public double getSalary() {
        return salary;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}
