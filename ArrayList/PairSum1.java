import java.util.ArrayList;
public class PairSum1{
  
  public static ArrayList<Integer> pairSum1(ArrayList<Integer>list , int target){
		 ArrayList<Integer>ans = new ArrayList<>();
		 ans.add(-1);ans.add(-1);
		 int lp =0;
		 int rp = list.size() - 1;
		 while(lp < rp){
			int sum = list.get(lp)+list.get(rp);
			if(sum == target ) {
				ans.set(0,lp);
				ans.set(1,rp);
				return ans;

			}
			else if (sum < target) lp++;
			else rp-- ;
		 }
	return ans;
  }
  public static void main(String[] args){
  	ArrayList<Integer>list = new ArrayList<>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(6);
	list.add(7);
	list.add(8);
   
	ArrayList<Integer>ans =pairSum1(list,5);
	System.out.println(ans.get(0) + "  " + ans.get(1));

	
	


  }
}