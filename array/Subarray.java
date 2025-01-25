public class Subarray {
    public static void main(String[] args){
        int[] arr = {4,3,1,5,6};

         int maxi =Integer.MIN_VALUE;
         int s = Integer.MAX_VALUE;
         int ss =0;
         for(int i =0;i<arr.length -1; i++)
         {      
                s = arr[i];
             
             for(int j = i+1;j< arr.length;j++){
               if(arr[j] < s){
                  ss = s;
                  s = arr[j];
                  
               }
               else if(arr[j] < ss) ss = arr[j];
            
                 maxi = Math.max(maxi, ss + s);
                
                
             }
         }
               System.out.println(maxi);
        
    }
}
