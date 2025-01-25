public class  PrintAllSubArrays {
    public static void main(String[] args){
        int[] nums = {0,1,2,3,4,5};
        int n = nums.length;
        int sum = 0;
        for(int i  =0 ;i<n;i++){
            sum = 0;
            for(int j = i;j< n;j++){
               sum+= nums[j];
               if(sum ==6){
                 for(int k = i ;k<= j ;k++){
                        System.out.print(nums[k]+" ");
                    }
                    System.out.println();
               }
               
               
               
               
               
               
            }
             
        }
    }
}
