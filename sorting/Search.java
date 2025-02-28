public class Search{

            // recursive function to search to find element in sorted and rotated array 
            // Notes : related to binary search just need to add few condition 

            public  static int searchTarget(int arr[] , int si , int ei , int target){
                //base condition 
                if(si > ei ) return -1;

                //kaam 
                int mid = si + (ei - si)/2;
                if  (arr[mid ] == target )return mid ;

                if  (arr[si ] <= arr[mid] ){
                        if(arr[si] <= target && arr[mid ]   >= target){
                           return  searchTarget(arr, si ,mid-1,target);
                        }
                        else{
                            return searchTarget(arr, mid +1 , ei, target);
                        }
                }
                else{

                    if  (arr[mid] <= target && arr[ei] >= target )  {
                         return searchTarget(arr, mid+1, ei,target) ;
                        }
                    else{
                            return searchTarget(arr, si, mid-1, target);
                    }
                 }
                
              

            }




        public static void main(String[] args) {
            int arr[] = {
                4,5,6,7,0,1,2,3
            };
            int target = 1;
            int taridx = searchTarget(arr,  0, arr.length-1 ,  target );
            System.out.println(taridx);

        }

}