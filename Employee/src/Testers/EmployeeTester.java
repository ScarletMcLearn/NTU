/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testers;

import Logics.Employee;

/**
 *
 * @author mac
 */
public class EmployeeTester {
    
       public static void main(String[] args) {
           
           
           Employee e1 = new Employee(1621176, 100, "Scar", "Let");
           System.out.println("e1 Employee's First Name: " + e1.getFirstName());
        System.out.println("e1 Employee's Last Name: " + e1.getLastName());
        System.out.println("e1 Employee's ID: " + e1.getID());
        System.out.println("e1 Employee's Full Name: " + e1.getName());
        System.out.println("e1 Employee's Salary: " + e1.getSalary());
        System.out.println("e1 Employee's Annual Salary: " + e1.getAnnualSalary());
        
        e1.setSalary(25);
        System.out.println("e1 Employee's Salary: " + e1.getSalary());
        
        
        System.out.println("e1 Employee's Annual Salary: " + e1.getAnnualSalary());
        
        
        e1.raiseSalary(2);
        System.out.println("e1 Employee's Salary: " + e1.getSalary());
        
        
        System.out.println("e1 Employee's Annual Salary: " + e1.getAnnualSalary());
        
        System.out.println(e1.toString());
        
        
        
        
    }
}
