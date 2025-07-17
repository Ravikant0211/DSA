package SortingAlgorithms.mergeSort;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 6, 9, 3, 1, 2, 5};
//        int arr[] = { 3, 2, 4, 1, 3, 2, 1, 2 };
        merge_sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge_sort(int[] arr, int low, int high) {
        if (low == high) return;
        int mid = (low + high) / 2;
        merge_sort(arr, low, mid);
        merge_sort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int temp[] = new int[high - low + 1];
        int left = low, right = mid + 1, i = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[i++] = arr[left];
                left++;
            } else {
                temp[i++] = arr[right];
                right++;
            }
        }
        while (left <= mid) {
            temp[i++] = arr[left++];
        }
        while (right <= high) {
            temp[i++] = arr[right++];
        }

        for (int j = low; j <= high; j++) {
            arr[j] = temp[j - low];
        }
    }
}
