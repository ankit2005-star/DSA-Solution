import java.util.Scanner;
public class ReverseWordWise {
    
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter a string U wanna Reverse  by Word Wise : ");
        String input = scanner.nextLine();
        String ans = "";
        int n = input.length();
        int ed_idx =n;
        for(int i = n-1;i>= 0;i--){
            if(input.charAt(i)==' '  || i == 0){
                int st_idx = i+1;
                if(i ==0 ) st_idx = 0;

                ans += input.substring(st_idx ,ed_idx) +" ";
                ed_idx = i;


            
             }
        }
        System.out.println(ans);
        scanner.close();
    }
    
}
