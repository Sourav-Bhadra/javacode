package com.company;

public class checkProcess {
    public static void main(String []args){
        int binary=1011011001;
        String str2 = "BA235D7";
        String str3 = "01/19/2012";
        String str1=String.valueOf(binary);
        System.out.println(str1.matches("[01]*"));
        System.out.println(str2.matches("[0-9A-F]+"));
        System.out.println(str3.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
    }
}
