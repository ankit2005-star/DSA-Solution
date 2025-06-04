import java.util.*;


public class FindOdd{ //find kth largest odd number in a given range

	

	public static void main(String[] args){


	int L = -3, R = 3 , k = 0;

	if( k <= 0) return ;

	Stack<Integer>s = new Stack<>();
	
	for( int i = L ; i <= R ; i++){

		if( i%2 != 0)s.push(i);
		

	}

	if( k > s.size()) return ;

	while( k > 1){
		
		s.pop();
		k--;

	}

	System.out.println(s.peek());


	}
	





}