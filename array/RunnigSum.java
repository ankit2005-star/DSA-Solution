public class RunnigSum {
    public static int[] runningSum(int input[]){
        
        
        Sum(input,1);
        return input;
         
         
    }
    private static void Sum(int[] input , int index){
        if(index == input.length) return ;  
        input[index] = input[index-1] + input[index];
        Sum(input, index+1);
    }
    public static void main(String[] args) {
    int arr[] = {1,1,1,1,1};
    int ans[] = runningSum(arr);
    for(int i =0;i<arr.length;i++){
        System.out.print(ans[i]+" ");
    }
    }
    
}
