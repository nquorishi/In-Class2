/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inclass2;

/**
 *
 * @author Naweed
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee empl1 = new Employee("Muhammad", "Ali", 100000.00);
        Employee empl2 = new Employee("Mike", "Smith", 60000.00);
        
        
        // OUTPUT: 
        // Employee 1:
        System.out.print("Employee 1 - Name:\t");
        System.out.println(empl1.getFname() + " " + empl1.getLname());
        
        System.out.print("Employee 1 - Salary:\t");
        System.out.println(empl1.getSalary());
        
        // Employee 2:
        System.out.print("Employee 2 - Name:\t");
        System.out.println(empl2.getFname() + " " + empl2.getLname());
        
        System.out.print("Employee 2 - Salary:\t");
        System.out.println(empl2.getSalary());
        
        
        // RAISE:
        empl1.getSalary();
        empl2.getSalary();
        
        System.out.println("\nAfter Raise:");
        System.out.print("Employee 1 - Salary:\t");
        System.out.println(empl1.getSalary());
        System.out.print("Employee 2 - Salary:\t");
        System.out.println(empl2.getSalary());
        
    }
}
