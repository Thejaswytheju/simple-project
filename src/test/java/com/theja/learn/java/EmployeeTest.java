package com.theja.learn.java;
public class EmployeeTest {

    public  static void main(String args[]){

        Employee empOne = new Employee("varshitha");
        Employee empTwo = new Employee("vidip");

        empOne.empAge(25);
        empOne.empDesignation("senior software engineer");
        empOne.empSalary(10000);
        empOne.printEmployee();
        empTwo.empAge(27);
        empTwo.empDesignation("junior software engineer");
        empTwo.empSalary(25000);
        empTwo.printEmployee();
    }

}
