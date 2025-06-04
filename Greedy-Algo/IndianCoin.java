import java.util.*;



//-------Indian Coins

//We are given an infinite supply of denomination [ 1,2 ,5, 10, 20 , 50 , 100 , 500 , 2000}
//Find min no. of coins/notes to make  change for value V 





public class IndianCoin{

		



	public static void main(String[] args){

		int[] arr = { 1 , 2 , 5 , 20 , 50 , 10 , 500 , 2000 , 100 };
		int val = 0;
		
		int ans = 0;

		Arrays.sort(arr);
		int n = arr.length;
		for( int i = n-1 ; i >= 0 && val > 0 ; i--){
			 
			
			while( arr[i] <= val && val > 0 ){
				 
				val -= arr[i];
				ans++;
			}
		
			

		}

		System.out.println(" min no. of coin req to make changes for value is : " + ans);

		

	}












}