package com.company.marksheet;

import java.util.Scanner;

public class celFaren {
    public static void main(String[] args){
        int cel,gap,far,lim;
        Scanner sc = new Scanner(System.in);
        far=sc.nextInt();
        gap=sc.nextInt();
        lim= sc.nextInt();

        while(far<=lim){
            cel=(far-32)*5/9;
            System.out.println(far + "\t" +cel);
            far+=gap;
        }
    }
}
