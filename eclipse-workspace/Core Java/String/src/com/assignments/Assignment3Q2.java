package com.assignments;

public class Assignment3Q2 {

    public static void main(String[] args) {

        StringBuffer str1 = new StringBuffer("StringBuffer");

        StringBuffer str = new StringBuffer("It is used to _ at the specified index position");
        StringBuffer str2 = new StringBuffer("This method returns the reversed object on which it was called");

        System.out.println(str1.append(" is a peer class of String"));

        System.out.println(str1.append( " that provides much of"));

        System.out.println(str1.append(" the functionality of strings " ));

        System.out.println(str.insert(14,"insert text"));

        System.out.println(str2.reverse());

    }
}    