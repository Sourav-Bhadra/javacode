package com.company;

import java.util.Scanner;

public class arraySearch {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("How many numbers you want to enter");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("Enter numbers");
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Enter numbers to search");
        int key = s.nextInt();
        for (int j=0;j<a.length;j++){
            if(a[j]==key){
                System.out.println("Number is in: "+(j+1)+" position");
                System.exit(0);
            }
        }
        System.out.println("Number is not present");
        s.close();
    }
}
