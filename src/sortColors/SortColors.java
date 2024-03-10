package sortColors;

// Problem link - https://leetcode.com/problems/sort-colors/description/
public class SortColors {
    public static void main(String[] args) {
        int arr[] = {2, 0, 2, 1, 1, 0};
        sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void sortColors(int[] nums) {
        int lo = 0, mid = 0, hi = nums.length - 1;
        while (mid <= hi) {
            if (nums[mid] == 0) {
                swap (nums, mid, lo);
                lo++; mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, hi);
                hi--;
            }
        }
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
