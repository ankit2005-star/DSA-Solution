package com.ankit.bitwiseOperator;
import java.util.Scanner;

public class Find_i_th {
    public static int findBit(int n,int num){
        int i = 0|1;  
        
        i= (i<<n-1);

       // System.out.println(i&num);
        
        return ((i&num) != 0)? 1 :0;

      //  for(int b = 1;b<n)
        //return (21474787) & (i<<n-1);

    }

    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int num = s.nextInt();
        System.out.println(findBit(n,num));
       s.close();
    }
    
}
