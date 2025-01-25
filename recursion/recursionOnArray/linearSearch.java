public class linearSearch {

    public static boolean Search(int[] arr , int index , int target){
        if(index == arr.length) return false;
        if(arr[index] == target) return true;
        return Search(arr,index+1,target);
    }
     public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int target = 7;
        System.out.println( Search(arr,
0,target));
}
   
}
