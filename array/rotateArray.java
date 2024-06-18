import java.util.Scanner;
public class rotateArray {

    public static void rotate(int arr[] , int d ){
        int n = arr.length;
        int start=0;
        int end = d-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        start = d;
        end = n-1;
       while(start<end){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
            start++;
             end--;
        }
           start = 0;
         end = n-1;
      while(start<end){
         int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
         start++;
           end--;
      }
        
        //  int n = arr.length;
      //  while(d>0){
      //      int temp = arr[0];
      //      for(int i=0;i<n-1;i++){
      //          arr[i] = arr[i+1];
      //      }
      //      arr[n-1] = temp;
      //      d--;
      //  }
 
    }
    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();;
        rotate(arr, d);
    for(int  i =0;i<n;i++){
        System.out.print(arr[i]+" ");
    } 

}
}
    

