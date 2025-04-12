import java.util.*;

public class DuplicateParenthesis{

	public static Boolean isDuplicate(String str ){
		Stack<Character> s = new Stack<>();
		int count = 0;
		char ob = '(';		
		char cb = ')';
		for(int i = 0 ; i < str.length() ; i++){
			char curr = str.charAt(i);
			if(curr == cb){
				
				while(s.peek() != ob) { count++ ; s.pop();}
				if(s.peek() == ob && count < 1) return true;
				else{ s.pop(); count =0;}
				

			}
			else s.push(curr);
			
			
		}
		
		return false;
	}

	public static void main(String[] args){
		String str = "(((a + b)) + c)";
		boolean ans = isDuplicate(str);
		System.out.println(ans );
	}

}

/*
(((a + (b))) + (c + d))


2. ((((a) + (b)) + c + d))


3. ((a + b) + (c + d))


4. (((a + b)) + c)
*/