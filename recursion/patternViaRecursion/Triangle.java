public class Triangle {

    public static void printTriangle(int row , int column){
        if(row == 0)
            return;
            if(column < row ){
                printTriangle(row,column+1);
                System.out.print("*");
                
            }
            else{
                printTriangle(row -1,0);
                System.out.println();
                
            }

        }
    
    public static void main(String[] args){
        printTriangle(4,0);

        
    }
    
}
