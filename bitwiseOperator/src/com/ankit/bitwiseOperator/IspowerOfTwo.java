package com.ankit.bitwiseOperator;

public class IspowerOfTwo {
    public static void main(String[] args){

        int n  = 4;
        int ans = (~n +1);


         
        if((ans^n) ==0 ) System.out.println(true);
        else System.out.println(false);


    }
    
}
