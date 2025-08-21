package DynamicProgramming.DpOnSubsequences.PartInTwoMinimizeSumDiff.Backtrack;

import java.util.Scanner;

public class Backtrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = minimumDifference(nums);
        System.out.println("Answer: " + ans);
    }

    public static int backtrack(int idx, int sum, int n, int mini, int totalSum, int[] nums) {
        if (n == 0) {
            mini = Math.min(mini, Math.abs(sum - (totalSum - sum)));
            return mini;
        }

        if (idx < 0) return mini;

        int take = backtrack(idx - 1, sum + nums[idx], n - 1, mini, totalSum, nums); //take
        int noTake = backtrack(idx - 1, sum, n, mini, totalSum, nums);

        return Math.min(take, noTake);
    }

    public static int minimumDifference(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int n = nums.length / 2;

        int totalSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        return backtrack(nums.length - 1, 0, n, mini, totalSum, nums);
    }
}
