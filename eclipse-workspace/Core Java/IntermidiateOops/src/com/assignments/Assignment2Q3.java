package com.assignments;

import java.util.*;
public class Assignment2Q3{
    int cash = 10000;

    int total=0;
    public int getCash(int cash){

        return 0;
    }
    public int totalCashInBank(ArrayList<Integer> cashInBank){
        System.out.println(cashInBank);
        return total;

    }

    static class SavingsAccount extends Assignment2Q3{
        ArrayList<Integer> al= new ArrayList<>();
        @Override
        public int getCash(int cash) {
            int deposit = 5000;
            int fixedDeposit = 1000;
            cash+=deposit+fixedDeposit;
            al.add(cash);

            //System.out.println("Total salary of labour is"+salary);
            return 0;

        }
    }
    static class CurrentAccount extends Assignment2Q3 {
        ArrayList<Integer> al2=new ArrayList<>();
        @Override
        public int getCash(int cash) {
            int totalDeposits  = 5000;
            int creditLimit = 2000;
            cash+= totalDeposits + creditLimit;
            al2.add(cash);
            //System.out.println("Total Salary of Manager is"+salary);
            return 0;
        }
    }
    public static void main(String[] args) {
        SavingsAccount obj=new SavingsAccount();
        CurrentAccount obj2= new CurrentAccount();
        Assignment2Q3 obj3= new Assignment2Q3();
        obj.getCash(500);
        obj.getCash(200);
        obj.getCash(600);
        obj2.getCash(500);
        obj2.getCash(800);
        obj2.getCash(1000);
        ArrayList<Integer> SavingsAccount=obj.al;
        //System.out.println(obj.al);
        ArrayList<Integer>CurrentAccount=obj2.al2;

        obj3.totalCashInBank(SavingsAccount);
        obj3.totalCashInBank(CurrentAccount);

    }
}