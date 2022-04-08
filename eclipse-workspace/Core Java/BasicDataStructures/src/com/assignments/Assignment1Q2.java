package com.assignments;

public class Assignment1Q2 {
    public static void main(String[] args){

        for (int i = 100; i<=999; i++){

            int num=i;
            int rem=0;
            int res=0;

            while(num>0){
                rem = num%10;
                res = res+(rem*rem*rem);
                num = num/10;
            }
            if(res==i) {
                System.out.print(i+ " ");
            }

        }
    }

}