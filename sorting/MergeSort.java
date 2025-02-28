public class MergeSort {

    // Method to sort the array using Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int middle = left + (right - left) / 2;

            // Recursively sort the first and second halves
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Merge the sorted halves
            merge(arr, left, right, middle);
        }
    }

    //merge function 
    public static void merge(int[] arr, int si, int ei, int mid) {
        int n1 = mid +1 -si; // Size of first subarray
        int n2 = ei - mid;     // Size of second subarray

        // Create temporary arrays for the two subarrays
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        // Copy data into temporary arrays
        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[si + i]; // Copy elements from the left half
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = arr[(mid + i+1)]; // Copy elements from the right half
        }

        // Merge the two temporary arrays back into the original array
        int i = 0, j = 0; // Initial indices for arr1 and arr2
        int k = si;       // Initial index for the merged array

        while (i < n1 && j < n2) {
            if (arr1[i]   <= arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1, if any
        while (i < n1) {
            arr[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2, if any
        while (j < n2) {
            arr[k++] = arr2[j++];
        }
    }

    // Method to merge two subarrays of arr[]
    public static void mergeString(String[] arr, int si, int ei, int mid) {
        int n1 = mid +1 -si; // Size of first subarray
        int n2 = ei - mid;     // Size of second subarray

        // Create temporary arrays for the two subarrays
        String[] arr1 = new String[n1];
        String[] arr2 = new String[n2];

        // Copy data into temporary arrays
        for (int i = 0; i < n1; i++) {
            arr1[i] = arr[si + i]; // Copy elements from the left half
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = arr[(mid + i+1)]; // Copy elements from the right half
        }

        // Merge the two temporary arrays back into the original array
        int i = 0, j = 0; // Initial indices for arr1 and arr2
        int k = si;       // Initial index for the merged array

        while (i < n1 && j < n2) {
            if (arr1[i].compareTo(arr2[j]) <= 0) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1, if any
        while (i < n1) {
            arr[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2, if any
        while (j < n2) {
            arr[k++] = arr2[j++];
        }
    }
        //function to find  majority of element
        // majority means number appears more than n/2 time 
        // n == arr.length
    //------------------------------------

            public static int findMajority(int arr[] ){
                mergeSort(arr, 0, arr.length-1);
                int si = 0;
                int ei = arr.length-1;
                int mid =  (ei+si)/2;
                return arr[mid];
            }

    // Main method to test the Merge Sort algorithm
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,1,1,2,2};
        System.out.println(findMajority(arr));
    }
}
