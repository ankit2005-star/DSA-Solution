import java.util.Scanner;

// sorting algo used when given array contain no. from 1-n

public class cyclicSort {
    
    public static void cyclic_Sort(int[] arr ,int n){
        for(int i= 0 ;i<n ;){
            if(arr[i] != i+1){
                int temp  = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1]=temp;
            }
            else i++;
        }
    }
    public static void takeInput(int[] arr , int n,Scanner scanner ){
        for(int i =0;i<n ;i++){
            arr[i] = scanner.nextInt();
        }
    }
        
        public static void printArray(int[] arr ){
            for(int i =0;i<arr.length ;i++){
                 System.out.print(arr[i] + " ");
             }
        }
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the size of an array :");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of an array: ");
            takeInput(arr,n,scanner);
            cyclic_Sort(arr,n);
            printArray(arr);
        }
    }
    
}
