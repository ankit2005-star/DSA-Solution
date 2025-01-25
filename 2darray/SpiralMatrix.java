public class SpiralMatrix {
        public static void displaySpiral(int[][] arr){
            int startRow = 0;
            int startCol = 0;
            int endRow = arr.length-1;
            int endCol = arr[0].length-1;

            while(startRow <= endRow && startCol <= endCol){
                    
                //top 
                for(int j = startCol ; j<= endCol ; j++){
                    
                        System.out.print(arr[startRow][j] + " ");
                }

                //right 

                for(int i = startRow +1 ; i <= endRow ; i++){

                        System.out.print(arr[i][endCol] + " ");
                }

                //bottom 
                 

                for(int j = endCol - 1 ; j >= startCol ; j--){
                                 if(startRow == endRow) break;
                        System.out.print(arr[endRow][j] + " ");
                }

                // left

                for(int i = endRow -1; i > startRow ; i-- ){
                            
                        if(startCol == endCol) break;
                        System.out.print(arr[i][startCol] + " ");
                }

                startCol++;
                startRow++;
                endCol--;
                endRow--;


            }

            System.out.println();

            
        }

        //driver function 

        public static void main(String[] args){
            int[][] arr  = { {  1 ,  2 ,11},
                                  {  3 ,  4 ,12},
                                  {  5 ,  6 ,13},
                                  {  7 ,  8 , 14},
                                  {  9 ,  10 , 15 }};
            displaySpiral(arr);
                
        }
}
