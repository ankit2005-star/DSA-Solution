import java.util.*;

public class QueueA{

	public static void interleave2Halves(Queue<Integer>q1 ){
		Queue<Integer>q2 = new LinkedList<>();
		int n = q1.size()/2;
		for(int i = 0 ; i < n ; i++){
			  
			
			q2.add(q1.remove());
		}
		while(!q2.isEmpty()){
		
		 
		 
		q1.add(q2.remove());
		  
		
		q1.add(q1.remove());
		 
		

		}



	}
	
	public static void printNonRepeating(String str){

		int freq[] = new int[26];
		Queue<Character>q = new LinkedList<>();
		int n = str.length();
		for(int i = 0 ; i < n ; i++){
			char ch = str.charAt(i);
			q.add(ch);
			freq[ ch -'a']++;
			
			while(!q.isEmpty() && freq[q.peek() - 'a'] > 1) q.remove();
			
			if(q.isEmpty()) System.out.println(-1);
			else System.out.println(q.peek());

		} 



	}




	public static void main(String[] args){
		//String str ="aabccxb" ;
		//printNonRepeating(str);
		
		Queue<Integer>q1 = new LinkedList<>();

		for( int i = 1 ; i <= 10 ; i++){ q1.add(i); q1.peek(); }
		
		interleave2Halves(q1);

		 
		
		 while(!q1.isEmpty())System.out.print(q1.remove() + " ");
	
	}
}