import java.util.Scanner;
public class printAllPairs {
    public static void takeInput(int[] arr,Scanner s){
        int size = arr.length;
        for(int i = 0;i<size  ;i++){
            arr[i] = s.nextInt();
        }
    }
    public static void  printAllpairs(int[] arr,int n){
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                System.out.println("("+ arr[i] +"," + arr[j] + ")");
            }
            
            
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array :");
        takeInput(arr,s);
        printAllpairs(arr,n);
    }
    
}
