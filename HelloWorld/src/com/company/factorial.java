package com.company;

import java.util.Scanner;

public class factorial {
    public static void main(String [] args) {
        int n,i,factorial = 1;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(i=n;i>1;i--){
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
