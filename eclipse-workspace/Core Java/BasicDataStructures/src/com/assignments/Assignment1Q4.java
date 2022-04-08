package com.assignments;

import java.util.Scanner;

public class Assignment1Q4 {
    public static void main(String[] args){
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 subjects marks");
        System.out.println("Subject 1 : ");
        int sub1 = scanner.nextInt();
        System.out.println("Subject 2 : ");
        int sub2 = scanner.nextInt();
        System.out.println("Subject 3 : ");
        int sub3 = scanner.nextInt();

        if(sub1<60 && sub2<60 && sub3<60) {
            if (sub1 + sub2 + sub3 > 60){
                System.out.println("passed");
                if (sub1 + sub2 > 60 || sub2 + sub3 > 60 || sub3 + sub1 > 60)
                    System.out.println("Promoted");
            }


            else if (sub1 + sub2 + sub3 < 60)
                System.out.println("failed");
        }

        else if(sub1>60 || sub2>60 || sub3 >60){
                System.out.println("failed");

        }
    }
}