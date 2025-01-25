package com.ankit.bitwiseOperator;
public class Main {
    public static boolean IsOdd(int n ){
        return (n & 1) == 1;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(IsOdd(n));
        System.out.println(2 ^ 2);

        
    }
    
}
