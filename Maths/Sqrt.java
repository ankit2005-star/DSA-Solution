public class Sqrt {
    public static void main(String[] args){
        System.out.printf( "%.3f",perfectSqrt(5,3));

    }
    public static int sqrt(int n){
        int high = n;
        int low = 1;
        while(low<= high){
            int mid = low + (high - low)/2;
            if(mid*mid < n ) low = mid+1;
            else if(mid * mid > n ) high = mid -1;
            else  return mid;

        }
        return -1;

    }
    public static double perfectSqrt(int  n , int pn ){
         
         int low  = 0;
         int high = n;
         double root = 0.0;
         
         while(low <= high ){
            int mid  = low + (high-low)/2;
            if(mid*mid == n )
               {
                root = mid;
                 return mid;
               }
            else if(mid*mid < n) low = mid +1;
            else high = mid-1;
         
        }
        
        double inr= 0.1;
        for(int i =0;i<= pn ; i++){
            while( root*root <= n){
                root = root + inr ;
                

            }
            root = root - inr ;
            inr = inr/10;
        }
        return root;
    }
   
}
