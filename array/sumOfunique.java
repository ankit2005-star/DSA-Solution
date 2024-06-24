import java.util.Scanner;
public class SumOfUnique{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        takeInput(arr,sc);
        cyclicSort(arr);

        
        sc.close();
    }
    
}
