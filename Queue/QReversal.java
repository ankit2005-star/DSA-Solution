import java.util.*;

public class QReversal{
	
	public static void qReversal(Queue<Integer>q ){


		Stack<Integer>s = new Stack<>();
		
		while(!q.isEmpty()) s.push(q.remove());
		
		while(!s.isEmpty()) q.add(s.pop());


	}



	public static void main(String[] args){
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i = 1 ; i <= 10 ; i++) q.add(i);
		
		qReversal(q);
		
		while(!q.isEmpty()) System.out.println(q.remove());


	}


}