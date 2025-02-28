public class GridWays{
        public static int gridWays(int n , int row , int col){
                if(row == n -1&& col == n-1)return 1;
                else    if(row ==n || col ==n) return 0;
                



                int right = gridWays(n, row, col+1);
                int down = gridWays(n ,row+1,col );


            return right + down;
        }

    public static void main(String[] args){
        

        System.out.println(gridWays(3,0,0));
    }
}
