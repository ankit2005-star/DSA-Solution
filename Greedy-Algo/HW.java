import java.util.*;
public class HW{


	public static void main(String[] args){

		 int N = 3  , k= 25;
		 StringBuffer s = new StringBuffer();

		for( int i = 26 ; i >= 1 && k > 0 && N > 0 ; i--){

			while(k - i >= N-1 && k > 0 && N > 0){

				s.insert(0 , (char)('a' + i -1)); 
				k = k-i;

				N--;
				 

			}
			

		}


   		

		 	System.out.println(s);



	}

}