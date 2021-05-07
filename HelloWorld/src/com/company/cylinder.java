package com.company;

import java.util.Scanner;

class cylinderCal{
    private double radius;
    private double height;

    //constructors

    public cylinderCal(double h){

        height=h;
    }


    public double getRadius(){
        return radius;
    }


    public double setRadius(double r){
        if(r>0){
            radius=r;
        }
        else{
            radius=0;
        }
        return (double) radius;
    }

    public double area(){
        return (double) ((2*Math.PI*radius*radius)+(2*Math.PI*radius)*height);
    }
}



public class cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        cylinderCal c=new cylinderCal(3.00);
        c.setRadius(n);


        double area=c.area();
        System.out.println(area);
    }

}
