import java.util.Scanner;
public class ispowerofthree {
    public static boolean isPowerOfThree(int n){
        if(n==1) return true;
        if(n==0) return false;
        
        return true & (n%3==0)? isPowerOfThree(n/3): false;

    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(isPowerOfThree(n));
    }
    
}
