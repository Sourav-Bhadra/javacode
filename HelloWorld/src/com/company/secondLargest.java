package com.company;

import java.util.Scanner;

public class secondLargest {
    public static void main(String []args){
        int max1,max2;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to enter");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter numbers");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        max1=max2=a[0];

        for (int i=0;i<a.length;i++){
            if (a[i]>max1){
                max2=max1;
                max1=a[i];
            }
            else if (a[i]>max2){
                max2=a[i];
            }
        }
        System.out.println("second max number "+max2);

    }
}
