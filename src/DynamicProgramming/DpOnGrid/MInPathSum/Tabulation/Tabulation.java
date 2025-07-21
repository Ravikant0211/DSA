package DynamicProgramming.DpOnGrid.MInPathSum.Tabulation;

import java.util.Scanner;

// TIME COMPLEXITY- O(m * n)
// SPACE COMPLEXITY- O(m * n)

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

        int ans = minPathSum(m, n, grid);
        System.out.println("Minimum Path Sum: " + ans);
    }

    public static int minPathSum(int m, int n, int[][] grid) {

        int[][] dp = new int[m][n];

        dp[0][0] = grid[0][0];

        for (int c = 1; c < n; c++) { // filling the first row
            dp[0][c] = dp[0][c - 1] + grid[0][c];
        }

        for (int c = 1; c < m; c++) { // filling the first column
            dp[c][0] = dp[c - 1][0] + grid[c][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i][j - 1], dp[i - 1][j]);
            }
        }

        return dp[m - 1][n - 1];
    }
}
