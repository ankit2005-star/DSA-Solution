public class Stock{


	public static void main(String[] args){
		
		int[] arr = { 7 , 6 , 4 , 3 , 1};
		int bp = Integer.MAX_VALUE;
		int max_profit = 0;

		for( int i = 0 ; i < arr.length - 1 ; i++){
			

			if( arr[i] < bp ) {

				bp = Math.min(bp,arr[i]);

				for( int j = i +1; j < arr.length ; j++){
				   int sp = arr[j];
				   if( sp > bp ){

					int profit = sp - bp;
					max_profit = Math.max(profit , max_profit);

				   }


				}


			}
			

		}

		System.out.println( " maximum profit is : " + max_profit);

	}
}