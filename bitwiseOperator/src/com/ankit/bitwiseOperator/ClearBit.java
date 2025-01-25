

public class ClearBit {
    public static int Clear(int num , int n){
        int mask = ~(1<<n-1);
        return  (num & mask);


    }
    public static void main(String[] args){
        System.out.println(Clear(2,2));
    }
    
}
