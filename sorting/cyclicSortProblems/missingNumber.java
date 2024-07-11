 
 import java.util.Scanner;
public class missingNumber{
    
      public static void takeInput(int[] arr , int n,Scanner scanner ){
                for(int i =0;i<n ;i++){
                      arr[i] = scanner.nextInt();
                 }
      }

      //main function start 
        public static void main(String[] args){ 
              Scanner scanner = new Scanner(System.in);
            System.out.println("enter the size of the array : ");
                  int n = scanner.nextInt();
                  int arr[] = new int[n];
                  System.out.println("enter the elements of the array : ");
                  takeInput(arr, n, scanner);
                    System.out.println(Solution.missing_Number(arr));

            scanner.close();
         }
         //main function end
}
//missingNumbers class ends 


   class Solution {
    //swaping index 

    static void swap(int arr[] , int index,int correct){
        int temp = arr[index];
        arr[index] = arr[correct];
        arr[correct] = temp;
    }
    //class for missing element
    public static int missing_Number(int[] arr){
        int n = arr.length;
        int index = 0;
        while(index < n ){
            if(arr[index] < n && arr[index] != index){
                 swap(arr,arr[index],index);
            }
            else index++;
            
        }

        for(int i =0;i< n;i++){
            if(arr[i] != i ) return i;
        }
        return n;


    }


 }