public class powerOfFour{
    public static boolean powerof_four(int n){
        if(n==0) return false;
        if(n==1) return true;
     if(n%4 == 0) return powerof_four(n/4);
     return false;   
    }
    public static void main(String[] args) {
    
        int n = 1;
        System.out.println(powerof_four(n));
    
    
    }
}