package com.assignments;

import java.util.*;
class Manager extends Assignment2Q2{
    @Override
    public int getSalary(int salary){
        int incentive=5000;
        return salary+incentive;
    }
}
class Labour extends Assignment2Q2{
    @Override
    public int getSalary(int salary){
        int overtime=500;
        return salary+overtime;
    }
}

public class Assignment2Q2 {
    int salary=10000;
    public int getSalary(int salary){
        return this.salary;
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        int total=0;
        for(int i:employeeSalaries){
            total+=i;
        }
        return total;
    }
    public static void main(String[] args) {
        ArrayList<Integer> salaries = new ArrayList<Integer>();
        Manager manager = new Manager();
        Labour labour = new Labour();
        Assignment2Q2 employee = new Assignment2Q2();
        int empSal = employee.getSalary(employee.salary);
        salaries.add(manager.getSalary(empSal));
        salaries.add(labour.getSalary(empSal));
        System.out.println("Total Salaries Of All Employees =>"+employee.totalEmployeesSalary(salaries));
    }
}