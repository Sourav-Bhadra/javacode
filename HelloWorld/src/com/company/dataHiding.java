package com.company;

import java.util.Scanner;

class rectangular{
    private int length;
    private int breadth;
    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }

    public int setLength(int l){
        if(l>0){
            length=l;
        }
        else{
            length=0;
        }
        return l;
    }

    public int setBreadth(int b){
        if(b>0){
            breadth=b;
        }
        else{
            breadth=0;
        }
        return b;

    }

    public int area() {
        return getLength()*getBreadth();
    }
}


public class dataHiding {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int l=sc.nextInt();
       int b=sc.nextInt();
        rectangular r = new rectangular();
        
        r.setLength(l);
        r.setBreadth(b);

        int areaCal=r.area();
        System.out.println(areaCal);
        sc.close();
    }

}
