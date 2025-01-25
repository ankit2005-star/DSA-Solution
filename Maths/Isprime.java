public class Isprime {

    public static void main (String[] args){
        
        int n =40;
     
        boolean[]  isPrime = new boolean[n+1];
         checkPrime2(n,isPrime);
         
         for(int i=0;i<=n;i++){
            System.out.println(isPrime[i] + " : " + i);
         }
         


    }

    //second way 
    public static  void checkPrime2(int n, boolean[] isPrime) {
         
        for(int i = 2 ; i*i <= n ;i++){
            if(!isPrime[i]){
                for(int j = i*i; j<= n ;j+=i){
                    isPrime[j] = true;
                }
            }
            
            
        }

     
    }
    // 


        //first way 
    // public static boolean checkPrime(int n){
        // if (n <= 1) {
            // return false;
        // }
        // int c = 2;
        // while(c*c <= n){
            // if(n%c == 0){
                // return false;
            // }
            // c++;
        // }
        // return true;
    // }
    
}
