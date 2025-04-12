import java.util.*;

public class ValidParenthesis {

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else {
                if (s.isEmpty()) return false;  // Prevent stack underflow
                
                char top = s.peek();
                if ((ch == ')' && top == '(') || 
                    (ch == ']' && top == '[') || 
                    (ch == '}' && top == '{')) {
                    s.pop();
                } else {
                    return false; // Mismatch case
                }
            }
        }
        return s.isEmpty(); // Stack should be empty for valid cases
    }

    public static void main(String[] args) {
        String str = "(){}{}[()()()]";
        System.out.println(isValid(str)); // Output: true

        String invalidStr = "([)]";
        System.out.println(isValid(invalidStr)); // Output: false
    }
}
