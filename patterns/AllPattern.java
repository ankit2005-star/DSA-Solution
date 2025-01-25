
 public class AllPattern{

    public static void pattern8(int n){
    
        for(int row = 0;row < n;row ++){
            for(int spc  = 0;spc < n-row-1;spc++){
                System.out.print(" ");
            }
            for(int col = 0;col < 2*row +1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }


    public static void main(String[] args ){
        int n=5;
        
        pattern8(n);
    }


    
    
    




    // public static void pattern7(int n ){
    // 
    // for(int row = 0;row < n;row++){
        // for(int spaces = 0;spaces<row ;spaces++){
            // System.out.print("  ");
        // }
        // for(int col = n -row ;col >0 ;col--){
            // System.out.print("* ");
        // }
    //    System.out.println();
    // }
// }
//   public static void pattern6(int n ){
        // 
        // for(int row = 0;row < n;row++){
            // // for(int spaces = 0;spaces<n-row-1;spaces ++){
                // System.out.print("  ");
            // }
            // for(int col = 0;col <1+row ;col++){
                // System.out.print("* ");
            // }
            // System.out.println();
        // }
    // }

    //  public static void pattern5(int n ){
    //  for(int row =0;row < n*2;row ++ ){
        //  
        //  int column = (row > n ? n*2-row:row);
        //  for( int col = 0 ; col < column ;col++){
            //  System.out.print("* ");
        //  }
        //  System.out.println();
    //  }
 //}


}