import java.util.*;


public class RFKE{  //Reverse first k elements of queue





	public static void reverse(Queue<Integer>q , int k ){
		int n = q.size();
		Stack<Integer>s = new Stack<>();
		for( int i = 1 ;i <= k ; i++) s.push(q.remove());
		

		while(!s.isEmpty()) q.add(s.pop());
		
		for(int i = 1  ; i <= (n-k) ; i++) q.add(q.remove());
		


	}






	public static void main(String[] args){

		Queue<Integer> q = new LinkedList<>();
		

		int k = 3;
		for(int i = 1 ; i <= 10 ; i++) q.add(i);
		System.out.println("before : " + q );
		reverse(q,k);
		System.out.println("after : " + q );



	}

}
