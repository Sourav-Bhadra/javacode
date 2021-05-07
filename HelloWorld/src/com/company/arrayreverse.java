package com.company;

import java.util.Scanner;

class arrayreverse{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
//matrix transpose

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int tmp=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=tmp;
            }
            
        }

//reverse
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length/2; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        } 
        
        
        //result
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }  
            System.out.println("");  
        }

    }
}