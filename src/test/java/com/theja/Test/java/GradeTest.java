package com.theja.Test.java;

public class GradeTest {

    public static void main(String args[]){
        char grade = 'B';
        switch (grade) {

            case ('A'):
                System.out.println("excellent");
                break;

            case ('B'):
                System.out.println("well done");
                break;

            case ('C'):
                System.out.println("sooper");
                break;

            default:
                System.out.println("invalid grade");
        }
        System.out.println("grade is:" +grade);

    }
}
