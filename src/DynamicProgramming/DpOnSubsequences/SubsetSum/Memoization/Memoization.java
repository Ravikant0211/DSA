package DynamicProgramming.DpOnSubsequences.SubsetSum.Memoization;

import java.util.Scanner;

public class Memoization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ans = isSubsetSum(arr, k);
        System.out.println("Answer: " + ans);
    }

    public static boolean isSubsetSum(int[] arr, int target) {
        int n = arr.length;
        Boolean[][] dp = new Boolean[n][target + 1];
        return backtrack(n - 1, target, arr, dp);
    }

    static Boolean backtrack(int idx, int target, int[] arr, Boolean[][] dp) {
        if (target == 0) return true;

        if (idx == 0) return arr[idx] == target;

        if (dp[idx][target] != null) return dp[idx][target];

        boolean noTake = backtrack(idx - 1, target, arr, dp);

        boolean take = false;

        if (target >= arr[idx]) {
            take = backtrack(idx - 1, target - arr[idx], arr, dp);
        }

        return dp[idx][target] = take || noTake;
    }
}
