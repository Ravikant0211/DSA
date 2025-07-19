package DynamicProgramming.DpOnGrid.GridUniquePaths.Optimized;

import java.util.Scanner;

public class Optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int ans = uniquePaths(m, n);
        System.out.println("Unique Paths: " + ans);
    }

    public static int uniquePaths(int m, int n) {
        int[] dp = new int[n];

        for (int i = 0; i < m; i++) {
            int left = 1;
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[j] = 1;
                } else {
                    dp[j] += left;
                    left = dp[j];
                }
            }
        }
        return dp[n-1];
    }
}