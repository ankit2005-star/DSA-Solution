package com.ankit.bitwiseOperator;

public class find {
    public static int x ;
    public static int findUnique(int[] arr,int last_idx){
         if(last_idx < 0) return 0;
         return x ^ arr[findUnique(arr, last_idx-1)];
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,1,2};
        System.out.println(findUnique(arr,arr.length));
    }
    
}
