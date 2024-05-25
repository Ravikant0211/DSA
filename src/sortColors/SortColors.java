package sortColors;

// Problem link - https://leetcode.com/problems/sort-colors/description/

// OPTIMAL - o(n)
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

// BETTER- TC- O(2N); SC- O(1)

class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0, ones = 0, twos = 0;
        for (int i = 0; i < nums.length; i++) {
            switch(nums[i]) {
                case 0: zeros++;
                break;
                case 1: ones++;
                break;
                case 2: twos++;
                break;
            }
        }

        int idx = 0;
        while (zeros-- > 0) {
            nums[idx++] = 0;
        }

        while(ones-- > 0) {
            nums[idx++] = 1;
        }

        while(twos-- > 0) {
            nums[idx++] = 2;
        }
    }
}
