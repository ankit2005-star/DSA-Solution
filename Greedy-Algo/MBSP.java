import java.util.*;


public class MBSP{ //Maximum Balanced String Partitioned


	public static void main(String[] args){


		String str = "LRLRLRLRLRLR";
		int x = 0;
		int counter = 0;

		for( int i = 0 ; i < str.length() ; i++){

		  char curr = str.charAt(i);

		  if( curr == 'L' ) counter++;
		  else counter--; 
		  	


		  if( counter == 0 ) x++;
		  


		}
		
		System.out.println( "maximum balanced substrings are : " + x);

	}

}