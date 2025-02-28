// Lonely Numbers in ArrayList (MEDIUM) 
// You are given an integer arraylist nums. A number x is lonely when it appears // only once, 
// and no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist. 
// Return all lonely numbers in nums. You may return the answer in any order. 
// Sample Input 1 : nums = 
// [10,6,5,8] Sample Output 1 : [10,8]


import java.util.*;


public class LonelyNumber{


  public static ArrayList<Integer> lonelyNumber(ArrayList<Integer>list  , int n){

	

  }


  public static void Scan(ArrayList<Integer>list,int n , Scanner s){
	for(int i = 0 ; i < n ; i++){
		list.add(s.nextInt());	
	}
	s.close();

  }
  public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	ArrayList<Integer>list = new ArrayList<>();
	System.out.println("Enter number of element : " );
	int n = s.nextInt();
	Scan(list,n,s);


 }
}