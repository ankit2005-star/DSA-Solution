import java.util.Scanner;
public class MaxSubarraySum {

    
    

    public static void maxSubarraySum(int numbers[] , int size){
                int maxsum = Integer.MIN_VALUE;
                int cursum = 0;

                //prefix array 
                int[] prefix = new int[numbers.length];
                prefix[0] = numbers[0];

                for(int i =1;i<numbers.length;i++){
                        prefix[i] = prefix[i-1] + numbers[i];
                }

                for(int i =0;i<numbers.length;i++){
                        int start = i;
                         
                        for(int j = i; j< numbers.length ; j++ ){
                                    int end  = j;


                                    cursum = start ==0 ? prefix[end] : prefix[end] - prefix[start -1];

                                    if(maxsum < cursum) maxsum = cursum;
                                    System.out.println(cursum);
                        }
                }

                System.out.print("maxsum is : " +  maxsum);
    }

    public static void main(String[] args){
        int arr[] = { 2 , -3 , -4 , 3, 1, -3};
        maxSubarraySum(arr, 6);
    }

};
