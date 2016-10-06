/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logics;

/**
 *
 * @author mac
 */



public class Employee {


    private int ID, Salary;

    private String First_Name, Last_Name;

    public Employee(int ID, int Salary, String First_Name, String Last_Name) {
        this.ID = ID;
        this.Salary = Salary;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
    }

    
    public int getID()
    {
        return this.ID;
    }
    
    public String getFirstName()
    {
        return this.First_Name;
    }
    
    public String getLastName()
    {
        return this.Last_Name;
    }
    
    public String getName()
    {
        return this.First_Name + this.Last_Name;
    }
    
    public int getSalary()
    {
        return this.Salary;
    }
    
    public int getAnnualSalary()
    {
        return this.Salary * 12;
    }
    
    
    public void setSalary(int inc)
    {
        this.Salary = inc;
    }
    
    
    
    public void raiseSalary(int inc)
    {
        this.Salary = ((inc * this.Salary)/100) + this.Salary;
    }
    
    
    public String toString()
    {
        return "Employee[id=" + getID() + ", First_Name=" + getFirstName() + ", Last_Name=" + getLastName() + ",Salary=" + getSalary() + "]";
    }
    

    
}
