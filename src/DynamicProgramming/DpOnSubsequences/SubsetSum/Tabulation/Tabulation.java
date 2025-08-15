package DynamicProgramming.DpOnSubsequences.SubsetSum.Tabulation;

import java.util.Scanner;

public class Tabulation {
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

    static Boolean isSubsetSum(int arr[], int target) {
        int n = arr.length;

        Boolean[][] dp = new Boolean[n][target + 1];

        // Base case formation
        for (int i = 0; i < n; i++) dp[i][0] = true;


        for (int i = 1; i <= target; i++) {
            dp[0][i] = false;
        }

        if (arr[0] <= target) {
            dp[0][arr[0]] = true;
        }

        for (int i = 1; i < n; i++) {

            for (int j = 1; j <= target; j++) {

                boolean noTake = dp[i-1][j];

                boolean take = false;

                if (j >= arr[i]) {
                    take = dp[i-1][j-arr[i]];
                }


                dp[i][j] = take || noTake;
            }
        }

        return dp[n - 1][target];
    }
}
