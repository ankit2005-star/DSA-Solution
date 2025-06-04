import java.util.*;

//Job sequencing problem 


// Given An Array Of Jobs Where Every Job has a Deadline and profit if the job is finished before the deadline . It is also given that every job takes single // unit time , so the minimum possible deadline for any job is 1. Maximize the total profit if only one job can be scheduled at a time 
// 


public class JobSequencing{

	static class Job{
		int id , deadline , profit;
		
		public Job( int i , int d  , int p ) {
			id = i ;
			profit = p;
			deadline = d;

		}	

	}




	public static void main(String[] args){

		int[][] jobsInfo = { {1,40} , {1,30} , {4,20} , {1,10} };
		ArrayList<Job> jobs = new ArrayList<>();

		for( int i = 0 ; i < jobsInfo.length ; i++){
			 

			jobs.add( new Job( i , jobsInfo[i][0] , jobsInfo[i][1] ) );
			 
			
		}
		
		
		Collections.sort( jobs , ( a, b) -> b.profit - a.profit ); //descending order acc to profit 
		 


		ArrayList<Integer> seq = new ArrayList<>();
		int time = 0 ; 

		for( int i = 0 ; i < jobs.size() ; i++){
			Job curr = jobs.get(i);
			
			if( curr.deadline  > time){

				time++;
				seq.add(curr.id);
			}
		}
		
		System.out.println( "max jobs : " + seq.size());

		System.out.println( seq);

	}


}