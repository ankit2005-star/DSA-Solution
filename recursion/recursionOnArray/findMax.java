public class findMax{

    
    public static int Max(int[] arr,int idx){
        if(idx == arr.length-1) return arr[idx];
        if(arr[idx] >arr[idx+1]) {
            int temp = arr[idx ];
            arr[idx] = arr[idx+1];
            arr[idx+1] = temp;
        } 
        return Max(arr,idx+1);
    }
    public static void main(String[] args){
        int[] arr = {8,7,6,5,4,3,2,1};
        int max  = Max(arr,0);
        System.out.println(max);
    }
}