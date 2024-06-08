import java.util.Scanner;
public class largestcolSum {

     static int  largestColSum(int arr[][] ){
        int maxSum = Integer.MIN_VALUE;
        int rows = arr.length;
        int cols = arr[0].length;
        for(int row =0; row< cols ;row++ ){
            int sum = 0;
            for(int col  = 0;col < rows ; col++ ){
                sum += arr[col][row];
            }
            if(sum > maxSum ) maxSum = sum;
        }
        return maxSum;
    }

  static void takeInput(int arr[][]  , Scanner sr){
        for(int i=0;i<arr.length;i++){
              System.out.println("Enter the elements of row " +  (i+1)+ " :");
            for(int j=0;j<arr[0].length;j++){
                
                arr[i][j]=sr.nextInt();
             }
             
        }
        sr.close();
    }

    public static void main(String[] args){
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the no, of test cases: ");
        int t = sr.nextInt();
        while(t-- > 0){

            System.out.println("enter the no. of rows: ");
            int n = sr.nextInt();
            System.out.println("enter the no. of columns: ");
            int m = sr.nextInt();
            int arr[][] = new int[n][m];
            takeInput(arr,sr);
            int largestColSum = largestColSum(arr);
            System.out.println("Largest column sum is " + largestColSum);

        
         }  
     }

    
}
