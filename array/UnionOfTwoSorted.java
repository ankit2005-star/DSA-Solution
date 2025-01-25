import java.util.ArrayList;
public class UnionOfTwoSorted {
    //Driver code
    public static void main(String[] args){
        int[] arr1 = {2,2,3,4,5,5};
        int[] arr2 = { 1,1,2,3,4,5};
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> ans = new ArrayList<>();
        ans = findUnion(arr1,arr2,n,m);


    }

    // Union function;

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int i =0;
        int j = 0;
        while(i<n && j <m){
            if(arr1[i] < arr2[j]){
                while(i+1 < n && arr1[i] == arr[i+1])i++;
                ans.add(arr1[i++]);
                
            }
            else if(arr1[i] == arr2[j]){
                while(arr[])
            }
        }


    
}
