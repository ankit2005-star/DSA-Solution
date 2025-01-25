public class GcdAndLcm {

    public static int gcd(int a , int b ){
            if(a==0) return b;

            if(a >= b) return gcd(a%b, b);

            return gcd(b%a,a);
    }
    public static void main(String[] args){
        int a  = 14 ;
        int b = 8;

        int hcf = gcd(a,b);
        System.out.println("hcf:" +   hcf);

        int lcm = (a*b)/hcf;
        System.out.println(" lcm: "+ lcm);





    }
    
}
