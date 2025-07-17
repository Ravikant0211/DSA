package DynamicProgramming.DpOnGrid.GridUniquePaths.Memoization;

import java.util.Scanner;

public class Memoization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int ans = uniquePaths(m, n);
        System.out.println("Unique Paths: " + ans);
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        return backtrack(m - 1, n - 1, dp);
    }

    public static int backtrack(int r, int c, int[][] dp) {
        if (r == 0 && c == 0) return 1;
        if (r < 0 || c < 0) return 0;

        if (dp[r][c] != -1) return dp[r][c];
        return backtrack(r, c - 1, dp) + backtrack(r - 1, c, dp);
    }
}
