import java.util.*;
public class FractionalKnapsack{


	public static void main(String[] args){

		int[] value  = { 100 , 60 , 120};
		int[] weight = { 20 , 10 , 30};
		
	
		//to store the ratio and corresponding index 

		double[][] ratio = new double[value.length][2];
		
		for( int i = 0 ; i < ratio.length ; i++){

			ratio[i][0] = i;
			ratio[i][1] = value[i]/(double)weight[i];
		}
		
		//sorting the ratio in ascending order;

		Arrays.sort(ratio , Comparator.comparingDouble( o -> o[1]));
		
		int capacity   = 50; 
		int finalVal = 0 ;

		for( int i = ratio.length - 1 ; i >= 0 ; i--){

			int idx = (int)ratio[i][0];

			if(capacity >= weight[idx]) //include full 
			{
				finalVal += value[idx];
				capacity -= weight[idx];
				
			}
			else{ //include ratio

				finalVal += (ratio[i][1] * capacity);
				capacity = 0;
				break;	

			}

		}  

		System.out.println("max Value we can add is : " +  finalVal );


	}


}