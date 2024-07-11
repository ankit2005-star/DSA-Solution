public class mergeSort{

 private static void merge(int[] a,int[] b, int[] c){
		int i =0;
		int j =0;
		int k =0;
		while(i<a.length && j < b.length){
			if(a[i]<= b[j]){
				c[k] = a[i];
				i++;
				k++;
			}
			else{
				c[k] = b[j];
				j++;
				k++;
			}

		}

		if(i<a.length){
			while(i<a.length){
				c[k] = a[i];
				i++;
				k++;
			}

		}
		if(j<b.length){
			while(j<b.length){
				c[k] = b[i];
				j++;
				k++;
			}
			
		}

	}
    
 
 

    private static void merge_Sort(int arr[] , int si , int ei){
			if(arr.length ==0) return;
        if(si < ei){
            int mid  = (si + ei )/2;
            
            int a[] = new int[mid];
			int b[] = new int[ei - mid];

			for(int i =si;i<a.length;i++){
				a[i] = arr[i];
			}
			for(int j =mid;j<arr.length;j++){
				b[j-mid] = arr[j];
			}
			merge_Sort(a, si, mid);
			merge_Sort(b,mid,ei);
			merge(a,b,arr);
            
            
          
        }

    }
    public static void main(String[] args){
        int arr[] = { 3,2,1};
        merge_Sort(arr,0,arr.length);
        for(int i =0;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }

}