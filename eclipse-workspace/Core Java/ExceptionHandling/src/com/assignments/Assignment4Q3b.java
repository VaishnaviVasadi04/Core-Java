package com.assignments;

public class Assignment4Q3b {

    public static void main(String[] args)  {

        double bal = 1000 , withdraw = -1000;


        try{

            if(withdraw < 0)
                throw new IllegalBankTransaction (withdraw-bal);

        }

        catch(IllegalBankTransaction e){
            System.out.println("Illegal Bank Transaction");
        }

    }

    public static class IllegalBankTransaction extends Exception{
        double amount;
        IllegalBankTransaction(double amt){
            amount = amt;
        }
    }

}