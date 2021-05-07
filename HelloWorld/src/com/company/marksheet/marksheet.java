package com.company.marksheet;

import java.util.Scanner;

public class marksheet {
    public static void main(String [] args){
        int math ,eng, science;
        Scanner sc = new Scanner(System.in);
        String name =sc.nextLine();
        math = sc.nextInt();
        eng=sc.nextInt();
        science=sc.nextInt();
        int average= (math+eng+science)/3;
        System.out.println(name);
        System.out.println(average);

    }
}
