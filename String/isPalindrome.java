public class isPalindrome {
    public static int is_Palindrome(String str , int si , int ei ){
        
       if(si>= ei) return 1;
       if(str.charAt(si) != str.charAt(ei)) return 0;
       return is_Palindrome(str,si+1,ei-1);

       


    }
    public static void main(String[] args){
        String s = "hih";
        System.out.println(is_Palindrome(s,0,s.length()-1));
    }
    
}
