public class countZeros {
    public static int helper(int num){
        if(num==0) return 0;
        int count = (num%10) ==0?1:0;
        return count + helper(num/10);

    }
    public static int count(int num){
        if(num == 0) return 1;
        int count  = helper(num);
        return count;
    }
    // main function beginning
    public static void main(String[] args){
        int num = 12300003;
        int count = count(num);
        System.out.println(count);
    }
    
}
