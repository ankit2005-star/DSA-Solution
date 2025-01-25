package com.ankit.bitwiseOperator;

public class SetithBit {
    public static int  Set(int num ,int n){

    return  num |(1<<n-1);
     

    }
    public static void main(String[] args){
        System.out.println(Set(0,3));

    }
    
}
