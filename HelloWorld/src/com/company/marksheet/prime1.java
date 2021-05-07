package com.company.marksheet;

import java.util.Scanner;

public class prime1 {
    public static void main(String[] args){
        long p;
        Scanner sc = new Scanner(System.in);
        p=sc.nextLong();
      //  boolean isprime = true;
        int div=2;
        while(div <= p-1){
            if(p%div==0){
              //  isprime = false;
                return;
            }
            div+=1;
        }
        System.out.println("prime");
//        if (isprime){
//            System.out.println("number is prime");
//        }
//        else{
//            System.out.println("number is composite");
//        }

    }
}