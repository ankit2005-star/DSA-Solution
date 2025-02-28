public class NQueenCountWays {

    public static boolean isSafe( char board[][]  , int row , int col){
                //vertical 
                for(int i = row-1 ; i >= 0 ;  i--){
                    if(board[i][col] == 'Q')return false;
                }
                //left diag
                for(int i = row-1 , j = col-1 ; i >= 0 && j >= 0 ; i-- , j--){
                    if(board[i][j] == 'Q')return false;
                }
                  //right diag
                for(int i = row-1 , j = col+1 ; i >= 0 && j < board[0].length ; i-- , j++){
                    if(board[i][j] == 'Q')return false;
                }
                return true;
    }
    
        public static void nQueen(char[][] board , int row  ){
                if(row >= board.length ){
                 print(board);
                    return;
                }

            for(int j = 0; j < board.length ; j++ ){
                if(isSafe(board,row,j)){
                    board[row][j]= 'Q'; //put queen 
                    nQueen(board, row+1);//recursion step
                    
                }
            }
        }
          
        public static void print(char[][] board ){
            System.out.println("---------chess Board-------");
            for(int row = 0 ; row < board.length ; row++){
                for( int col = 0 ; col < board[0].length ; col++){
                    System.out.print(board[row][col] + " ");
                }
                System.out.println();
                
            }
          
        }



    public static void  main(String[] args){
        int n = 5;
        char[][] board = new char[n][n];
             
        for(int i = 0 ;  i < board.length;   i++){
            for(int j = 0  ;   j <   board[0].length ; j++){
                board[i][j] = 'X';
            }
        }

        nQueen(board, 0);
          
    }


}
