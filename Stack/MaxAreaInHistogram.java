import java.util.*;

public class MaxAreaInHistogram{

	public static int maxArea(int heights[] ){

		int maxArea = Integer.MIN_VALUE;
		
		int nsl[] = new int[heights.length];
		int nsr[] = new int[heights.length];
		nsl(heights , nsl);
		nsr(heights , nsr);
		int i,j ; i = j = 0;
		while( i < heights.length){
			int length = heights[i];
			int width = (nsr[j++] - nsl[i++] - 1);
			int area = length * width   ;
			maxArea = Math.max(maxArea,area);
			
			
		}
		
		return maxArea;


	}

	public static void nsr(int[] heights , int[] nsl){
		Stack<Integer>s = new Stack<>();
		
		for(int i = nsl.length-1 ; i >= 0 ; i--){
			while(!s.isEmpty() && heights[i] <= heights[s.peek()])  s.pop();
			
			if(s.isEmpty()){ 
				nsl[i]= heights.length; 
				 
			}
			else{
				nsl[i] = s.peek();
				
			}
			 s.push(i);

		}
	
	}



	public static void nsl(int[] heights , int[] nsl){
		Stack<Integer>s = new Stack<>();
		
		for(int i = 0 ; i < nsl.length ; i++){
			while(!s.isEmpty() && heights[i] <= heights[s.peek()])  s.pop();
			
			if(s.isEmpty()){ 
				nsl[i]=-1; 
				
			}
			else{
				nsl[i] = s.peek();
				 
			}
			 s.push(i);

		}
	
	}

	public static void main(String[] args){
		int heights[] = {6,6,6,6,6,6};
		int ans = maxArea(heights);
		System.out.println("max area in histogram is  : " + ans);
		
	}

}