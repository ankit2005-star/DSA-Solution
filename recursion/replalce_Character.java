package recursion;

public class replalce_Character {
    public static String replaceChar(String s , char c, char replace){
        if(s.length() == 0) return s;

        String substring = replaceChar(s.substring(1),c,replace);
        if(s.charAt(0) == c) {
            return replace + substring ;
        }
        else{
            return s.charAt(0) + substring;
        }
        }


    
    public static void main(String[] args){
        String str = "Hello World";
        char c = 'o';
        char replace = '*';
        System.out.println(replaceChar(str,c,replace));
    }
    
}
