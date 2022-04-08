package com.assignments;


public class Assignment3Q3 {
    public static void main(String[] args)
    {
        StringBuilder str1 = new StringBuilder("StringBuilder");

        StringBuilder str = new StringBuilder("It is used to _ at the specified index position");
        StringBuilder str2 = new StringBuilder("This method returns the reversed object on which it was called");

        System.out.println(str1.append(" is a peer class of String"));

        System.out.println(str1.append( " that provides much of"));

        System.out.println(str1.append(" the functionality of strings " ));

        System.out.println(str.insert(14,"insert text"));

        System.out.println(str2.reverse());

    }
}