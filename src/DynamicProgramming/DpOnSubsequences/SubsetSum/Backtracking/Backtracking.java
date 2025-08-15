package DynamicProgramming.DpOnSubsequences.SubsetSum.Backtracking;

import java.util.Scanner;

public class Backtracking {
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
        return backtrack(arr.length - 1, target, arr);
    }

    public static Boolean backtrack(int idx, int target, int[] arr) {
        if (target == 0) return true;

        if (idx == 0) return arr[idx] == target;

        boolean noTake = backtrack(idx - 1, target, arr);

        boolean take = false;

        if (target >= arr[idx]) {
            take = backtrack(idx - 1, target - arr[idx], arr);
        }

        return take || noTake;
    }
}
