package com.ankit.bitwiseOperator;

public class MagicNumber {

    public static  int  Magic(int n){
        int base = 5;
        int ans = 0;
        while(n>0){
            int last = n&1;
            n = n>>1;
            ans += base *last;
            base *= 5;

        }
        return ans;
    }
    public static void main(String[] args){
        System.out.println(Magic(1));
    
    }

}
