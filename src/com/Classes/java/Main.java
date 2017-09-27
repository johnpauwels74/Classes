package com.Classes.java;

public class Main {

    public static void main(String[] args) {
        //create the 3 employees using the Employee class
        Employee person1 = new Employee(16598, 1, "John Pauwels");
        Employee person2 = new Employee(27858, 2, "Lu Pauwels");
        Employee person3 = new Employee(78954, 3, "Eric Lobodzinski");

        //display each employee's information using the method in the class for appropriate format
        person1.displayEmployeeInfo();
        System.out.println("\n");
        person2.displayEmployeeInfo();
        System.out.println("\n");
        person3.displayEmployeeInfo();

    }
}