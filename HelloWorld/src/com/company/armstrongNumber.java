package com.company;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String []args){
        int n,r,m,sum=0;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        m=n;
        while (n>0){
            r=n%10;
            n=n/10;
            sum=sum+(r*r*r);

        }
        System.out.println(sum);
        if(sum==m){
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
}
