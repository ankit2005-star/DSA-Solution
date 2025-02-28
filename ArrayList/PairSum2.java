import java.util.ArrayList;
public class PairSum2{
  public static ArrayList<Integer> pairsum(ArrayList<Integer>list , int target){
	ArrayList<Integer>ans = new ArrayList<>();
	ans.add(-1);ans.add(-1);
	int n = list.size();
	
	 for(int i = 0 ; i < n - 1 ; i++){
	 
		if(list.get(i) > list.get(i + 1) ) {
			int rp = i;
			int lp = i+1;
			while(lp != rp){
			    if((list.get(lp)+list.get(rp)) == target){
			    	ans.set(0,lp);ans.set(1,rp);return ans;
			    }else if((list.get(lp) + list.get(rp) ) < target)lp = (lp+1)%n;
			    else rp = (n + rp - 1)%n;
			
			}
		}
		
	 }


	return ans;	
  }

	
  public static void main(String[] args){
	ArrayList<Integer>list = new ArrayList<>();
	list.add(11);
	list.add(15);
	list.add(6);
	list.add(8);
	list.add(9);
	list.add(10);
	
	ArrayList<Integer>ans = pairsum(list,16); 
	System.out.println(ans.get(0) + " " + ans.get(1));
	
	
  }
}