//// Inversion- Inversion depicts how far the array is from getting sorted.
//
//// Brute Force soln- (Using insertion sort)
//// TC: O(n^2)
//// SC: O(1)
//class Solution {
//    // arr[]: Input Array
//    // N : Size of the Array arr[]
//    // Function to count inversions in the array.
//    static long inversionCount(long arr[], int n) {
//        long count = 0;
//        for (int i = 0; i < n; i++) {
//            int j = i;
//            while (j > 0 && arr[j] < arr[j  - 1]) {
//                swap(arr, j, j - 1);
//                j--; count++;
//            }
//        }
//        return count;
//    }
//
//    static void swap(long[] arr, int i, int j) {
//        long temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//
//    }
//}
//
//
////---------------------------------------------------------------------------------------------
//
//// Optimal soln- (Application of merge sort)
//// TC: O(nlogn)
//// SC: O(n)
//class Solution {
//    // arr[]: Input Array
//    // N : Size of the Array arr[]
//    // Function to count inversions in the array.
//    static long mergeSort(long[] arr, int low, int high) {
//        long count = 0;
//        if (low == high) return count;
//        int mid = (low + high) / 2;
//        count += mergeSort(arr, low, mid);
//        count += mergeSort(arr, mid + 1, high);
//        count += merge(arr, low, mid, high);
//        return count;
//    }
//
//    static long merge(long[] arr, int low, int mid, int high) {
//        long temp[] = new long[high - low + 1];
//        int left = low, right = mid + 1, i = 0;
//
//        long count = 0;
//        while (left <= mid && right <= high) {
//            if (arr[left] <= arr[right]) {
//                temp[i++] = arr[left++];
//            } else {
//                temp[i++] = arr[right++];
//                count = count + (mid - left + 1);
//            }
//        }
//
//        while (left <= mid) {
//            temp[i++] = arr[left++];
//        }
//
//        while (right <= high) {
//            temp[i++] = arr[right++];
//        }
//
//        for (i = low; i <= high; i++) {
//            arr[i] = temp[i - low];
//        }
//        return count;
//    }
//    static long inversionCount(long arr[], int n) {
//      return mergeSort(arr, 0, n - 1);
//    }
//
//}
