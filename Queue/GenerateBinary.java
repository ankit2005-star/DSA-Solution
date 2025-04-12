import java.util.*;

public class GenerateBinary{
	public static int d2B(int n ){
		 int ans = 0;
		Stack<Integer>s = new Stack<>();
		while(n > 0){
			 s.push(n&1) ;
			 n = n>>1;
		}
		while( !s.isEmpty()) ans= ans * 10 + s.pop();
		return ans;
	}
	
	public static void genBinary(Queue<Integer>q , int n ){
		
		for(int i = 1 ; i <= n ; i++) q.add(d2B(i));

	}

	public static void main(String[] args){
		int n = 10 ;
		
		 
		Queue<Integer> q = new LinkedList<>();
		  genBinary(q,n);
		System.out.println(q);


	}

}