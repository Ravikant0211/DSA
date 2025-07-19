package DynamicProgramming.DpOnGrid.GridUniquePaths2.Memoization;

import java.util.Scanner;

// TIME COMPLEXITY- O(M * N)
// SPACE COMPLEXITY- O(m + n) + O(M * N)

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

        int ans = uniquePathsWithObstacles(m, n, grid);
        System.out.println("Unique Paths: " + ans);
    }

    public static int uniquePathsWithObstacles(int m, int n, int[][] grid) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return backtrack(m - 1, n - 1, grid, dp);
    }

    public static int backtrack(int r, int c, int[][] grid, int[][] dp) {
        if (r < 0 || c < 0 || grid[r][c] == 1) return 0;

        if (r == 0 && c == 0) return 1;

        if (dp[r][c] != -1) return dp[r][c];

        return dp[r][c] = backtrack(r, c - 1, grid, dp) + backtrack(r - 1, c, grid, dp);
    }
}
