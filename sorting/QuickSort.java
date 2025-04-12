public class QuickSort{
    public static void quickSort(int[] arr , int low , int high){
        if(low <= high ){
            int pivot_index = partition(arr, low, high);
            quickSort(arr, low , pivot_index-1);
            quickSort(arr, pivot_index+1, high);
        }
    }

    public static int partition(int[] arr , int low , int high){
        int pivot_index = high ;
        int pivot_elem = arr[high];
        int i = low -1;
        for(int j = low ;  j < high ; j++){
            if(arr[j] < pivot_elem){
                i++;
                int temp = arr[i];
                arr[i] = arr[j] ; 
                arr[j] = temp; 
            }

        }
        i++;
        int temp = arr[i];
        arr[i] = arr[pivot_index];
        arr[pivot_index] = temp;
        return i ;
    }

    public static void printArr(int[] arr){
        for(int i =0  ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = {7,48,89, 77, 0};
        System.out.print("before sorting : ");
        printArr(arr);
        quickSort(arr,0,arr.length - 1);
        System.out.print("after sorting : ");
        printArr(arr);
    }
}