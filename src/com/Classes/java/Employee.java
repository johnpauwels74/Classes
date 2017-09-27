package com.Classes.java;

//create Employee class
public class Employee {

    //declare variables
    private int employeeNumber;
    private int employeeShift;
    private String employeeName;

    //instantiate new Employee with all 3 variables
    public Employee(int employeeNumber, int employeeShift, String employeeName) {
        this.employeeNumber = employeeNumber;
        this.employeeShift = employeeShift;
        this.employeeName = employeeName;
    }

    //gets and sets
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public int getEmployeeShift() {
        return employeeShift;
    }

    public void setEmployeeShift(int employeeShift) {
        this.employeeShift = employeeShift;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    //method for displaying information with proper format
    public void displayEmployeeInfo(){
        System.out.println("Employee Number: " + employeeNumber +
                "\nEmployee Name: " + employeeName +"\nShift: " + employeeShift);
    }
}