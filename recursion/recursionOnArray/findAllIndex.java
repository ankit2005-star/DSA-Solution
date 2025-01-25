import java.util.ArrayList;

public class findAllIndex{
          public static ArrayList<Integer> returnAllindex(int arr[] ,int target,int index, ArrayList<Integer>list){
            if(index == arr.length) 
            return list;
            if(arr[index] == target) list.add(index);
            return returnAllindex(arr,target,index+1,list);
          }

         
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,4,};
        int target  = 4;
        ArrayList<Integer> ans = returnAllindex(arr,target,0,new ArrayList<Integer>());
        System.out.println(ans);
    
    
    }
}
