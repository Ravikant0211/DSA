package DynamicProgramming.DpOnGrid.MinFallPathSum.Tabulation;

import java.util.Scanner;

// Time complexity = O(M * N)
// Space complexity = O(M * N), For DP[][] array only

public class Tabulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] grid = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int ans = minFallingPathSum(m, n, grid);
        System.out.println("Minimum Path Sum: " + ans);
    }

    public static int minFallingPathSum(int m, int n, int[][] mat) {
        int[][] dp = new int[m][n];

        int totalMinSum = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    dp[i][j] = mat[i][j];
                }  else {
                    int left = j > 0 ? dp[i - 1][j - 1] : Integer.MAX_VALUE;
                    int right = j < n - 1 ? dp[i - 1][j + 1] : Integer.MAX_VALUE;
                    int down = dp[i - 1][j];
                    dp[i][j] = mat[i][j] + Math.min(left, Math.min(down, right));
                }

                if (i == m - 1) {
                    totalMinSum = Math.min(dp[i][j], totalMinSum);
                }
            }
        }

        return totalMinSum;
    }
}
