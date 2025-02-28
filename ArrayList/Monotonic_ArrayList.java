// Monotonic ArrayList (EASY) 
// An Arraylist is monotonic if it is either monotone increasing or monotone decreasing. 
// An Arraylist nums is monotone increasing if for all i <= j, nums.get(i) <= nums.get(j). An 
// Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j). 
// Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise. 
// Sample Input 1 : nums = [1,2,2,3] 
// Sample Output 1 : true 
// Sample Input 2 : nums = [6,5,4,4] 
// Sample Output 2 : true 
// Sample Input 3 : nums = [1,3,2] 
// Sample Output 3 : false 
// Constraints : 
// ● 1 <= nums.size() <= 105 
// ● -105 <= nums.get(i) <= 105


import java.util.ArrayList;
import java.util.Scanner;
public class Monotonic_ArrayList{


  public static Boolean isMonotone(ArrayList<Integer>list , int n ){
	if((n == 1)  ) return true;
	 
	if( list.get(0) <=  list.get(n-1) ){
		//increasing order
		for(int i = 0 ; i < list.size() - 1 ; i++){
		  if( list.get(i) > list.get(i+1) ) return false;
		}
	} else {
		//decreasing order
		for(int i = 0 ; i < list.size() - 1 ; i++){
		  if( list.get(i) < list.get(i+1) ) return false;
		}
	}


	return true;

  }

  public static void Scan(ArrayList<Integer>list , int n , Scanner s ){
	
	System.out.println("Enter  elements : ");
  	for(int i = 0 ; i < n ;i++ )
	{
		list.add(s.nextInt());

	}
	s.close();
  }

  public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      ArrayList<Integer>list = new ArrayList<>();

      System.out.println("Enter no.. of elements : ");
      int n = s.nextInt();
      Scan(list,n,s);
      
	
	System.out.println(isMonotone(list,n));
  }
}