import java.util.Scanner;

public class Swapalternate {

    public static  void takeInput(int[] arr,Scanner s){
        int size = arr.length;

        for(int i =0;i<size;i++){
            arr[i] = s.nextInt();
        }
    }

    public static void swapAlternate(int[] arr){
        int temp = 0;
        int i=0;
        while(i<arr.length){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
         i +=2;
        }
    }


        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter no. of testcases:");
            int t =s.nextInt();
            while(t>0){
                System.out.println("Enter the array size for test case :" + t);
                int n = s.nextInt();
                int[] arr = new int[n];
                Swapalternate.takeInput(arr,s);
                Swapalternate.swapAlternate(arr);
                for(int i = 0;i<n;i++){
                    System.out.print(arr[i] + " ");
                    t--;
                }
                System.out.println();

            }
        }
    
    
}
