import java.util.Scanner;
public class IsPalindrome2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(isPalindrome(str))
            System.out.println("PALINDROME ");
        else 
           System.out.println("NOT PALINDROME");
        
         
         

        sc.close();
    }

    public static boolean isPalindrome(String str){


            String newStr = trim(str);
            int i =0;
            int j = newStr.length()-1;
            boolean result = true;
            while(i <=j){
                if(newStr.charAt(i) != newStr.charAt(j)) result = false;
                i++;
                j--;
            }
            return result;

   }
     public static String trim(String str){
            
        String resStr = "";
        for(int i =0;i<str.length();i++){
            if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= '0' && str.charAt(i) <= '9')){
                     resStr+= str.charAt(i);
            }
            else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                    resStr+= (char)(str.charAt(i) + 32);
            }
        }
        return resStr;
    }

}
