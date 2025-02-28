import java.util.ArrayList;
public class MaxTrappingWater{
   
	//brute force solution TC -> O(n^2)
 	//  public static int maxTrappingWater(ArrayList<Integer>heighta){
	
	// 		int maxWater = 0;

	// 		for(int i =0;i<heighta.size()-1;i++){
	//  		  for(int j = i +1 ; j<heighta.size() ; j++ ){
	//   		 	int height = Math.min(heighta.get(i),heighta.get(j));
	// 			int width = j - i ;
	// 			int curWater = height * width;
	// 			maxWater = Math.max(maxWater, curWater);
	//  		  }
	// 	 	}
	// 			return maxWater;
 	// 	 }

				//Two pointer Approach Linear  TC -> O(n)
				public static int maxTrappingWater(ArrayList<Integer>height){
					int maxWater = 0;
					int lp = 0;
					int rp = height.size() -1;
					while( lp < rp ){
							int h = Math.min(height.get(lp),height.get(rp));
							int w = rp - lp;
							int curWater = h * w;
							maxWater = Math.max(curWater,maxWater);
							if( height.get(lp) < height.get(rp) ) lp++;
							else rp--;
					}
					
					return maxWater;
				}

  public static void main(String[] args){
	ArrayList<Integer>list = new ArrayList<>();
	list.add(1);
        list.add(8);
	list.add(6);
	list.add(2);
	list.add(5);
	list.add(4);
	list.add(8);
	list.add(3);
	list.add(7);
	System.out.println(maxTrappingWater(list));


  }
}