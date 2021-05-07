package com.company;

import java.util.Scanner;

public class pattern {
    public static void main(String []args){
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i+j>n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int j=2;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
