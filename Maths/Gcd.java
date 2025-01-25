import  java.util.Scanner;
public class Gcd {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(gcd(n1,n2));
        sc.close();

    }
    public static int gcd(int n1,int n2){
        if(n1 == 0 ) return n2;
        
        return (n1>n2)? gcd(n1%n2, n2):gcd(n2%n1,n1);
    }

    

    
}
