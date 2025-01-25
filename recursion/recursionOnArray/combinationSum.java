import java.util.ArrayList;
import java.util.List;
public class combinationSum {



    public static void Rec(int[] arr,int target,int index , List<List<Integer>>ans,List<Integer>list){
        if(index == arr.length){
            if(target == 0) ans.add(new ArrayList<>(list));
            return;
        }
        if(arr[index]<= target){
            list.add(arr[index]);
            Rec(arr,target-arr[index],index,ans,list);
            list.remove(list.size()-1);
        }
        Rec(arr,target,index+1,ans,list);
        
    }


    public static List<List<Integer>> Combinational(int[] candidates , int target){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>list = new ArrayList<>();
         Rec(candidates,target,0,ans,list);
        return ans;

    }
    public static void main(String[] args){

        int candidates[] = {2,3,5};
        int target = 8;
        System.out.println(Combinational(candidates,target));
    }
    
}
