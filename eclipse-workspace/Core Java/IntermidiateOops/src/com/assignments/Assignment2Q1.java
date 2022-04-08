package com.assignments;

import java.util.Objects;

public class Assignment2Q1
{
    private static Assignment2Q1 sub;
    public String str;
    private Assignment2Q1()
    {
        str = "THIS CLASS IS SINGLETON";
    }
    public static Assignment2Q1 getInstance()
    {
        if(sub == null)
        {
            sub = new Assignment2Q1();

        }
        return sub;
    }
    public static void main(String args[])
    {
        Assignment2Q1 obj1 = Assignment2Q1.getInstance();
        Assignment2Q1 obj2 = Assignment2Q1.getInstance();
        System.out.println(obj1.str);
        System.out.println(obj2.str);
        Object SingletonInheritanceCheck = null;
        SingletonInheritanceCheck(obj1,obj2);

    }

    private static void SingletonInheritanceCheck(Assignment2Q1 obj1, Assignment2Q1 obj2) {

    }
}

class SingletonInheritanceCheck{
    public static void Check(Assignment2Q1 x, Assignment2Q1 y) {
        if (Objects.equals(x, y)) {
            System.out.println("Singleton Inheritance check completed and authenticated");

        } else {
            System.out.println("this is not a singleton class");
        }
    }
}