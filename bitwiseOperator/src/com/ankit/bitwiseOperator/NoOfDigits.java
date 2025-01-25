package com.ankit.bitwiseOperator;

public class NoOfDigits {
    
    public static void main(String[] args){
        int num = 1134344155;
        int count = 0;
        count += Math.log(num)/Math.log(10) + 1;
        System.out.println(count);
    }
    
    
}
