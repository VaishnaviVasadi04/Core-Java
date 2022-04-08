package com.assignments;

public class Assignment4Q2 extends Throwable{
    public static void main(String[] args) throws UnsupportedOperationException{
        int a,b,c ;
        a = 4;
        b= 0;
        try {
            c=a/b;
            System.out.println(c);
        } catch ( UnsupportedOperationException e) {
            e.printStackTrace();
            System.out.println("invalid");
        }


    }
}