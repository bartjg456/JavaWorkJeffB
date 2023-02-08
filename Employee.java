/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author itlabs
 */
public class Employee
{
    private String fname;
    private String lname;
    private double salary;
    
    public Employee()
    {
        fname = "none";
        lname = "none";
        salary = 0.0;
    }
    
    public Employee(String fn, String ln, double s)
    {
        fname = fn;
        lname = ln;
        salary = s;
    }
    
    public String getFname()
    {
        return fname;
    }
    
    public String getLname()
    {
        return lname;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void setFname(String fname)
    {
        this.fname = fname;
    }
    
    public void setLname(String lname)
    {
        this.lname = lname;
    }
    
    public void setSalary(double salary)
    {
        if (salary > 0.0)
        this.salary = salary;
    }
    
}
