package com.company.marksheet;

import java.util.Scanner;

import static java.lang.Math.abs;

public class diagonalSum {

    public static void main(String args[]){
        int numInputs,curInput,leftD=0,rightD=0,ans;
        Scanner sc = new Scanner(System.in);
        numInputs=sc.nextInt();
        for(int j = 0; j < numInputs; j++){
            for(int k = 0; k < numInputs; k++){
                curInput=sc.nextInt();
                if(j == k){
                    leftD += curInput; //for left side diagonal
                }
                if(j+k == (numInputs-1)){
                    rightD += curInput; //for right side diagonal
                }
            }
        }
        ans = abs(leftD-rightD);
        System.out.println(ans);
    }
}
