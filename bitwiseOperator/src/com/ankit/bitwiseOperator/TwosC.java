package com.ankit.bitwiseOperator;

public class TwosC {
    public static int TwosC(int num){

        num = ~num+1;
        return num ; 
    }
    

    public static void main(String[] args){
        System.out.println(TwosC( 20));
        
    }
}
