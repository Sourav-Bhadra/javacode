package com.company;

import java.util.Scanner;

public class input {
    public static void main(String[] args){

        int a,b;

        Scanner s = new Scanner(System.in);
        a= s.nextInt();
        b=s.nextInt();
        int c = a+b;

        System.out.println(c);
         s.nextLine();

        String w = s.nextLine();
        System.out.println(w);
        char r = w.charAt(0);
        System.out.println(r);
    }
}
