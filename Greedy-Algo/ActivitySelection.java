public class ActivitySelection{

	
	public static int maxActivity(int[] start , int[] end ,int n){
				
		int st = start[0];
		int et = end[0];
		int count = 1;
		int i  ;
		for( i = 1  ; i < n ; i++){
			

			if(start[i] >= et){
				System.out.println("Activity : " + i + " start time " + st + " end time " + et); 
				st = start[i];
				et = end[i];
				
				count++;
			
			}		
		}
		System.out.println("Activity : " + i + " start time " + st + " end time " + et);
		return count;
	
	}




	public static void main(String args[]){

		int[] start = {1,3,0,5,8,5};
		int[] end = {2,4,6,7,9,9};
		int n = start.length;
		
		System.out.println("Maximum activity performed is : " + maxActivity(start,end,n));
		

	}


}