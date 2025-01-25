public class ConstructTriangle{

    // for printing array 
    public static void printArray(int arr[],int index){
        if(index == arr.length){
            return;
            }
           
            System.out.print(arr[index]+" ");
             printArray(arr,index+1);
    }    
    //for triangle sum 
    public static void printTriangle(int arr[] ){
        if(arr.length <1)return;

        int [] temp = new int[arr.length-1];
        for(int i =0;i<temp.length;i++){
            temp[i] = arr[i]+arr[i+1];
        }
        printTriangle(temp);
        printArray(arr, 0);
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
     printTriangle(arr);
    }

}
