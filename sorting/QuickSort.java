 public  class QuickSort{

        public static void quickSrot(int arr[] , int si , int ei ){
            if(si>= ei )return;

            int pivotIndex = partition(arr, si, ei);
            quickSrot(arr, si, pivotIndex-1);
            quickSrot(arr, pivotIndex+1, ei);
        }





    public static int partition(int arr[] , int si , int ei ){
        int  pivot = arr[ei];
        int pivotIndex = ei;
        int  i = si-1;

        for(int j =si;j<ei;j++){
            if(arr[j]< pivot ){
                int temp = arr[++i];
                arr[i] =arr[j];
                arr[j]=temp;

            }
        }
                
            int temp =arr[++i];
            arr[i] = arr[pivotIndex];
            arr[pivotIndex]= temp;
        return i;
    }


public static void printArray(int arr[] ) {
    for(int i =0; i< arr.length ; i++){
        System.out.print(arr[i] + " ");
    }
}




    public static void main (String[] args ){
        
        int arr [] = {9,8,7,6,5,4,3,2,1};
            quickSrot(arr, 0, arr.length-1);
            printArray(arr);

    }
 }