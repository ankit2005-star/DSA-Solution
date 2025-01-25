public class StairCaseSearch {
            
    public static void staircaseSearch(int[][] arr , int target){
             int row = 0; int endCol = arr[0].length -1;

             while(row < arr.length && endCol >= 0){
                if(arr[row][endCol] == target)
                {
                        System.out.println( " element fount at  index "  + row   + " , " + endCol );
                        return;
                } 
                else if(target < arr[row][endCol] ) endCol--;
                else row++;
             }

             System.out.println("Not found ");

             
    }
    public static void main(String[] args){
        int arr[][] = {
                                { 1 , 2 , 3 , 4  },
                                { 5 , 6 , 7 , 7  },
                                { 8 , 9 , 10 , 11 },
                                { 12 , 13 , 14 , 15}
        };

        staircaseSearch(arr, 12);
    }
}
