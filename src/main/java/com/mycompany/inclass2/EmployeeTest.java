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
        Employee empl1 = new Employee();
        Employee empl2 = new Employee("Mike", "Smith", 60000.00);
        
        System.out.print("Employee 2 - Name: ");
        System.out.println(empl2.getFname() + empl2.getLname());
        
        System.out.print("Employee 2 - Salary: ");
        System.out.println(empl2.getSalary());
    }
}
