import java.util.*;
public class ReverseString {
    

    public static void main(String[] args){
        String str = "Ankit";       
        Stack<Character>ch = new Stack<>();
        StringBuilder result = new StringBuilder();
            for(int i =0; i < str.length() ; i++)ch.push(str.charAt(i));
            System.out.println(ch);
            while(!ch.isEmpty())result.append(ch.pop());
            System.out.println(result);
    }
}
