public class MLCOP{  //max lenth chain of paris 





	public static void main(String[] args){
		
		int pairs[][] = { {5,24} , {39,69} , {5,28} , {27,40} , {50 , 90} };
		
		Arrays.sort( pairs , Comparator.comparingDouble( o -> o[1] ) );

		int chainLen = 1;
		int  chainEnd = pairs[0][1]; // Last selected pair end

		for( int i = 1 ; i < paris.length ; i++){
			
			if( pairs[i][0] >  chainEnd ){
			
				chainLen++;
				chainEnd = pairs[i][1];
			}

		}

		System.out.println(" max Chain lenght is : " + chainLen );


	}

}

