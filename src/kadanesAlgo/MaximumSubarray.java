package kadanesAlgo;

// Problem link = https://leetcode.com/problems/maximum-subarray/description/

public class MaximumSubarray {
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int ans = maximumSubarray(arr);
        System.out.println(ans);
    }
    public static int maximumSubarray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int a : arr) {
            sum += a;
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) sum = 0;
        }
        return maxSum;
    }
}
