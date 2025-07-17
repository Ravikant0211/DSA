package Arrays.nextPermutation;

// problem link- https://leetcode.com/problems/next-permutation/description/
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 1;
        while (i > 0) {
            if (nums[i] > nums[i - 1]) {
                int idx = i - 1;
                int j = n - 1;
                while (j > idx) {
                    if (nums[j] > nums[idx]) {
                        int temp = nums[j];
                        nums[j] = nums[idx];
                        nums[idx] = temp;
                        break;
                    }
                    j--;
                }
                break;
            }
            i--;
        }
        reverse(nums, i, n-1);
    }
    public void reverse(int[] nums, int l, int r) {
        while (l <= r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++; r--;
        }
    }
}
