 public class reverseNumber{
    public static int countDigit(int n){
        int count = 0;
        while(n>0){
            count = count + 1;
            n = n/10;
            }
            return count;
    }
    //creating a powerOf10 func
    public static int powerOf10(int n){
        int pow = 1;
        for(int i = 0; i < n; i++){
            pow *= 10; 
        }
        return pow;
    }
    //creating a reverse function 
     
    public static int reverse(int num ){
        if(num == 0) return 0;
        int count = countDigit(num) -1;
        return num %10 * powerOf10(count) + reverse(num/10);
    }
    
    //main function started 
    public static void main(String[] args ){
            int num = 12345;
            int reverse = reverse(num);
            System.out.println(reverse);
        }
 }