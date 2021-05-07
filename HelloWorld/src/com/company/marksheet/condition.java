package com.company.marksheet;

import java.util.Scanner;

public class condition {
    public static void main(String [] args){
        int first, second;
        Scanner sc = new Scanner(System.in);
        first=sc.nextInt();
        second=sc.nextInt();
        if (first>second){
            System.out.println("first number is greater");
        }
        else if(first==second){
            System.out.println("two numbers are equal");
        }
        else{
            System.out.println("Second number is greater");
        }
    }
}

