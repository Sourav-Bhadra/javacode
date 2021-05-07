package com.company.marksheet;

import java.util.Scanner;

public class characterChecking {
    public static void main(String [] args){
        char ch;
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);
        if (Character.isAlphabetic(ch)){
            if(Character.isUpperCase(ch)){
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }
        }
        else{
            System.out.println("-1");
        }

    }
}
