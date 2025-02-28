public class NQueen {
                public static boolean isSafe(char board[][] , int row , int col ){
                        //vertical upward 
                        for(int i = row-1 ;   i>=0 ; i--){
                                if(board[i][col] == 'Q')return false;
                        }
                        // left diag
                        for(int i = row-1, j = col-1; i >= 0 && j >= 0 ; i--, j--){
                            if(board[i][j] == 'Q') return false;
                        }
                        //right diag
                            for(int i = row-1, j = col+1;  i >= 0 && j < board[0].length ; i--, j++){
                                if(board[i][j] == 'Q') return false;
                            }
                                return true;
                }
            public static void nQueen(char board[][] , int row){
                if(row == board.length) {
                    print(board);
                    return;
                }

                for(int col = 0; col < board.length ; col++){
                    if(isSafe(board,row,col)){
                         board[row][col] = 'Q';
                         nQueen(board, row+1);
                         board[row][col] = 'X'; 
                    }
                   
                }
            }




        public static void print(char arr[][] ){
            System.out.println("------------------");
            for(int i =0;i<arr.length ; i++){
                        for(int j = 0;j<arr[0].length ; j++)System.out.print(arr[i][j] + " ");
                  System.out.println();

                }


        }
        
    public static void main (String[] args){
        int n = 4;
        char[][] board = new char[n][n];
         for(int i =0;i<board.length ; i++)for(int j = 0;j<board[0].length ; j++) board[i][j] = 'X';
                  

                
        nQueen(board,0);

    }
}
