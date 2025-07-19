package DynamicProgramming.DpOnGrid.GridUniquePaths2.Tabulation;

import java.util.Scanner;

// TIME COMPLEXITY- O(M * N)
// SPACE COMPLEXITY- O(M * N)

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

        int ans = uniquePathsWithObstacles(m, n, grid);
        System.out.println("Unique Paths: " + ans);
    }

    public static int uniquePathsWithObstacles(int m, int n, int[][] grid) {
        if (grid[0][0] == 1) return 0;

        int[][] dp = new int[m][n];

        dp[0][0] = 1;

        for (int i = 1; i < n; i++) { // filling first row
            dp[0][i] = grid[0][i] == 1 ? 0 : dp[0][i-1];
        }

        for (int i = 1; i < m; i++) { // filling first column
            dp[i][0] = grid[i][0] == 1 ? 0 : dp[i - 1][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (grid[i][j] == 1) dp[i][j] = 0;
                else dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }

        return dp[m - 1][n - 1];
    }
}
