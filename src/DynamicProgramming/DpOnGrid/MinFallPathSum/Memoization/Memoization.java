package DynamicProgramming.DpOnGrid.MinFallPathSum.Memoization;

import java.util.Scanner;

// TIME COMPLEXITY = O(3 * M)
// SPACE COMPLEXITY = O(M * N) + O(M)

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

        int ans = minFallingPathSum(m, n, grid);
        System.out.println("Minimum Path Sum: " + ans);
    }

    public static int minFallingPathSum(int m, int n, int[][] mat) {

        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Integer.MIN_VALUE;
            }
        }

        int totalMinSum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int minSum = backtrack(m - 1, i, mat, dp);
            totalMinSum = Math.min(minSum, totalMinSum);
        }

        return totalMinSum;
    }

    public static int backtrack(int r, int c, int[][] mat, int[][] dp) {
        if (c < 0 || c >= mat[0].length) return Integer.MAX_VALUE;

        if (r == 0) return mat[r][c];

        if (dp[r][c] != Integer.MIN_VALUE) return dp[r][c];

        int left = backtrack(r - 1, c - 1, mat, dp);
        int down = backtrack(r - 1, c, mat, dp);
        int right = backtrack(r - 1, c + 1, mat, dp);

        return dp[r][c] = mat[r][c] + Math.min(left, Math.min(down, right));
    }
}
