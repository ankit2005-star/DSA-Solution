import java.util.Scanner;
public class rowWiseSum {

    //taking input of the array 
    public static void takeInput(int arr[][],Scanner scanner){
         for(int j = 0 ; j < arr.length ; j++){
             System.out.print("Enter the elements of in " + j + " th row : ");

                 for(int k = 0 ; k < arr[0].length; k++){
        
                     arr[j][k] = scanner.nextInt();
                }
     System.out.println();
  }  

    }

    //printing the sum of rowWiseSum of array 
    public static void rowWisesum(int[][] arr){
        int rowSum = 0;
        if(arr.length == 0) return;

        for(int i =0;i<arr.length;i++){
            rowSum = 0;
            for(int j=0;j<arr[0].length;j++){
                rowSum += arr[i][j];
            }
            System.out.print( rowSum + " ");
        }
        System.out.println();

    }

    //main function starting 
   public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t ;
         System.out.println("Enter the number of test cases");
         t = scanner.nextInt();
         for(int i = 0 ; i < t ; i++){
            int n;
            int m;
            System.out.println("Enter the number of rows");
            n = scanner.nextInt();
            System.out.println("Enter the number of cols" );
            m = scanner.nextInt();

            int arr[][] = new int[n][m];
            takeInput(arr,scanner);
            rowWisesum(arr);
           
           
           
           

           
        

           
        }
                scanner.close();  
    }
}   
//end{code}
