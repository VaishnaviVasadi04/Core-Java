package com.assignments;

import java.util.Scanner;

public class Assignment4Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number");
        int a = scanner.nextInt();

        System.out.println("Enter 2st number");
        int b = scanner.nextInt();
        int c ;

        try {
            c= a/b;
            System.out.println("Result:" + c);
        }
        catch (ArithmeticException e) {

            System.out.println("ArithmeticException Handled");



        }
    }
}