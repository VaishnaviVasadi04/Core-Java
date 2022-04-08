package com.assignments;

public class Assignment3Q1 {

    public static void main(String[] args) {
        String str = "Hello World";
        String s = "Hello" +" How are you";
        String str1 = "Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println(str);

        System.out.println(str.length());

        System.out.println(s);

        System.out.println(str1.toLowerCase());

        System.out.println(str1.toUpperCase());

        System.out.println(str1.replace('a','$'));

        System.out.println(str1.contains("collection"));

        System.out.println(str1 =="java string pool refers to collection of strings which are stored in heap memory" );

        System.out.println(str1.equals("java string pool refers to collection of strings which are stored in heap memory"));

    }
}    