import java.util.*;

public class MADOP{
	     //(min absolute difference of pairs)


	public static void main(String[] args){

		int[] A = { 1 ,2 ,4 , 8};
		int[] B = { 8 , 7,  2 , 1};

		Arrays.sort(A);
		Arrays.sort(B);


		int minAbsDiff = 0;

		for(int i = 0  ; i < A.length ; i++){

			minAbsDiff += Math.abs(A[i] - B[i] ) ;

		}
		
		System.out.println( " min absolute diff is : " + minAbsDiff );

	}



}