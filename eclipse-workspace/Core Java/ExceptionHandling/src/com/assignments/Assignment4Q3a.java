package com.assignments;

public class Assignment4Q3a {

    public static void main(String[] args) throws InsufficientBalanceException, IllegalAccessException {

        double bal = 900 , withdraw = 1000;

        try{

            if(bal<withdraw && withdraw>0)
                throw new InsufficientBalanceException();

        }

        catch(InsufficientBalanceException e){
            System.out.println("Insufficient Money");
        }


    }

    public static class InsufficientBalanceException extends Exception{
        double amount;
        double amt;
        InsufficientBalanceException(){

            amount = amt;
        }
    }

}