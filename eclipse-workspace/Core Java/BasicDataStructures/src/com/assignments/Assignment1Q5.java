package com.assignments;

import java.util.Scanner;

class TaxAmount{
    static double tax;
    public static double calculateTaxAmount(int ctc){
        if(ctc<=180000)
            tax = 0;
        else if(ctc>=181001 && ctc<=300000)
            tax = (ctc/100)*10;
        else if(ctc>=300001 && ctc<=500000)
            tax = (ctc/100)*20;
        else if (ctc>500001 && ctc<=1000000)
            tax = (ctc/100)*30;

        return tax;
    }
}
public class Assignment1Q5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ctc : ");
        int ctc = scanner.nextInt();

        System.out.println("Your tax amount is : "+ TaxAmount.calculateTaxAmount(ctc));

    }
}