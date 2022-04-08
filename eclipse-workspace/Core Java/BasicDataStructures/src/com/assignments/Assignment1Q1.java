package com.assignments;

import java.util.Scanner;

class ArmstrongOrNot {
        public void armstrongCheck(int num) {

        }
}

public class Assignment1Q1 {

        public static void main(String[] args) {

                System.out.println("Enter a 3 digit number to find if its an Armstrong number : ");

                Scanner scanner = new Scanner(System.in);
                int num = scanner.nextInt();

                int result = 0;
                int orig = num;
                int remainder = 0;


                while (num > 0) {
                        remainder = num % 10;
                        result = result + (remainder * remainder * remainder);
                        num = num / 10;
                }

                if (result==orig)
                        System.out.println("It is an Armstrong number");
                else
                        System.out.println("It is not an Armstrong number");


        }
}