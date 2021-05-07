package com.company.marksheet;

import java.util.Scanner;

public class sumN {
    public static void main(String [] args){
        int n,sum=0,i=1;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();

        while (i<=n ){
            sum+=i;
            i=i+1;
        }
        System.out.println(sum);
    }
}
