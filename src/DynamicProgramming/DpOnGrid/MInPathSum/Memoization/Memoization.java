package DynamicProgramming.DpOnGrid.MInPathSum.Memoization;

import java.util.Scanner;

// TIME COMPLEXITY- O(m * n)
// SPACE COMPLEXITY- O(m + n) + O(m * n)

public class Memoization {
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

        int ans = minPathSum(m, n, grid);
        System.out.println("Minimum Path Sum: " + ans);
    }

    public static int minPathSum(int m, int n, int[][] grid) {

        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return backtrack(m - 1, n - 1, grid, dp);
    }

    public static int backtrack(int r, int c, int[][] grid, int[][] dp) {
        if (r == 0 && c == 0) return grid[r][c];

        if (r < 0 || c < 0) return Integer.MAX_VALUE;

        if (dp[r][c] != -1) return dp[r][c];

        int left = backtrack(r, c - 1, grid, dp);
        int right = backtrack(r - 1, c, grid, dp);

        return dp[r][c] = grid[r][c] + Math.min(left, right);
    }


}
