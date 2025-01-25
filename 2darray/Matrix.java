import java.util.Scanner;

public class Matrix {
        public static void displayMatrix(int[][] arr ){
                for(int i =0;i<arr.length ; i++){
                    for(int j = 0 ; j<arr[0].length ; j++){
                          System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }
        }
        public static void inputMatrix(int[][] arr , int n , int m ){
                System.out.println("Enter the element of matrix : ");
                Scanner sc = new Scanner(System.in);
                for(int row = 0 ;  row < n ; row++ ){
                    for(int col = 0 ; col < m ; col++ ){
                        arr[row][col]  = sc.nextInt();
                    }
                }
        }

        public static void main(String[] args){
            // creation of _2dArray 
            int[][] arr = new int[3][4];
            inputMatrix(arr, 3, 4);
            displayMatrix(arr);
            
        }
}
