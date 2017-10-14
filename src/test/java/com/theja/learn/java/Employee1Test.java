package com.theja.learn.java;

public class Employee1Test {

    public static void main(String args[]) {

        Employee1Test e1 = new Employee1Test();
        Employee1Test e2 = new Employee1Test();
        e1.setId(100);
        e2.setId(100);

        //Prints 'true'
        System.out.println(e1.equals(e2));
    }


    public void setId(int id) {
        this.hashCode();
    }
}


