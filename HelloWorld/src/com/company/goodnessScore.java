package com.company;
import java.util.InputMismatchException;

import java.util.Scanner;

public class goodnessScore{

    
    public static void main(String[] args) {
        int T,k,N,x,minoperation;
        String s;
        Scanner sc =new Scanner(System.in);
        T=sc.nextInt();
        try{
            while(T!=0){
                N=sc.nextInt();
                k=sc.nextInt();
                s=sc.next();
                 minoperation=0; x=0;
                for (int i = 0; i < N/2; i++) {
                    if(s.charAt(i) !=s.charAt(N-i-1))
                    {
                        x++;
                    }
                    
                }
                if(x==k){
                    minoperation=0;
                    System.out.println(minoperation);
                }
                else if(x>k){
                    minoperation=x-k;
                    System.out.println(minoperation);
                }
                else{
                    minoperation=k-x;
                    System.out.println(minoperation);
                }
                T--;
               
            }

        }catch(InputMismatchException exception){
            System.out.println(exception);
        }
        
       
       sc.close();
    }
}