package com.assignments;

import java.util.HashSet;

public class Assignment5Q1 {


    private String name;
    private int age;

    public Assignment5Q1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    public static void main(String[] args) {
        Assignment5Q1 o1 = new Assignment5Q1("Vaish", 21);
        Assignment5Q1 o2 = new Assignment5Q1("Prix", 22);

        HashSet<Assignment5Q1> employees = new HashSet<>();
        employees.add(o1);
        employees.add(o2);

        System.out.println(employees);
    }
}