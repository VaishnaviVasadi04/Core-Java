package com.assignments;
import java.util.*;

public class Assignment6Q4 {
    int date,month,year;

    public Assignment6Q4(int date,int month,int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public String toString(){
        return date+"-"+month+"-"+year;
    }

    public int getYear(){
        return year;
    }

    public static void main(String[] args) {
        LinkedList<Assignment6Q4> dob = new LinkedList<>();


        dob.add(new Assignment6Q4(12,12,2000));
        dob.add(new Assignment6Q4(10,10,1999));
        dob.add(new Assignment6Q4(11,12,1996));
        dob.add(new Assignment6Q4(26,07,2003));
        dob.add(new Assignment6Q4(28,01,1995));
        dob.add(new Assignment6Q4(30,04,2012));
        dob.add(new Assignment6Q4(21,11,1992));

        for (int i = 0 ; i<dob.size();i++){
            int year = dob.get(i).getYear();
            if (year%400==0 || year%100==0 || year%4==0){
                System.out.println(dob.get(i)+" : Born in Leap Year.");
            }else{
                System.out.println(dob.get(i)+" : Not Born in a Leap Year.");
            }

        }
    }

}