import java.util.Scanner;

public class Pattern1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
                    char ch = 'A';
            for(int j= 1;j<=n;j++){
                System.out.print(ch);
                ch=(char)('A'+1);
            }
            System.out.println();
        }
    }
}