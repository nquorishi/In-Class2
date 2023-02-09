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
        Employee empl1 = new Employee("Muhammad", "Ali", 1000.00);
        Employee empl2 = new Employee("Mike", "Smith", 9000.00);
        
        
        // OUTPUT: 
        // Employee 1:
        System.out.println("\tEmployees: ");
        System.out.print("Employee 1 - Name:\t");
        System.out.println(empl1.getFname() + " " + empl1.getLname());
        
        System.out.print("Employee 1 - Yearly Salary:\t");
        System.out.println(empl1.getMonthlySalary() * 12);
        
        // Employee 2:
        System.out.print("Employee 2 - Name:\t");
        System.out.println(empl2.getFname() + " " + empl2.getLname());
        
        System.out.print("Employee 2 - Yearly Salary:\t");
        System.out.println(empl2.getMonthlySalary() * 12);
        
        
        // RAISE:
        empl1.setMonthlySalary(empl1.getMonthlySalary() * 1.10);
        empl2.setMonthlySalary(empl2.getMonthlySalary() * 1.10);
        
        System.out.println("\n\tAfter Raise:");
        System.out.printf("Employee 1: " + empl1.getFname() + " " + empl1.getLname() + " - Yearly Salary: \t");
        System.out.println("$" + empl1.getMonthlySalary() * 12);
        System.out.printf("Employee 2: " + empl2.getFname() + " " + empl2.getLname() + " - Yearly Salary: \t");
        System.out.println("$" + empl2.getMonthlySalary() * 12);
        
    }
}