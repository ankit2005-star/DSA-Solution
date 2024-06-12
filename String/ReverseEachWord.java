import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string :");
        String str = scanner.nextLine();
        
        int st_idx =0;
        String ans = "";
        for(int i =0;i<str.length(); i++){
            
            String reverseWord = "";
            if(str.charAt(i)  == ' ' || (i+1)== str.length() ){
                int ed_idx = i;
                for(int j = ed_idx; j >=st_idx ; j-- ){
                    reverseWord += str.charAt(j);
                }
                  ans += reverseWord + " ";
                  st_idx = i+1;
            }
          
          
        

        }
        System.out.println(ans);
       
    }
    
}
