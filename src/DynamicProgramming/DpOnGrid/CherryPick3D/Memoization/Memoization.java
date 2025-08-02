package DynamicProgramming.DpOnGrid.CherryPick3D.Memoization;

import java.util.Scanner;

// TIME COMPLEXITY: O(9 * (m * n * n)) + O(m * n * n)

// SPACE COMPLEXITY: O(M) + O(m * n * n) => recursive stack space + dp array

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

        int ans = cherryPickup(grid);
        System.out.println("Answer: " + ans);
    }

    public static int cherryPickup(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][][] dp = new int[m][n][n];

        // This loop run (m * n * n) times
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }

        return backtrack(0, 0, n - 1, dp, grid);
    }

    public static int backtrack(int r, int c1, int c2, int[][][] dp, int[][] grid) {
        if (c1 < 0 || c2 < 0 || c2 >= grid[0].length || c1 >= grid[0].length)
            return 0;

        if (r == grid.length - 1) {
            if (c1 == c2) return grid[r][c1];
            else return grid[r][c1] + grid[r][c2];
        }

        if (dp[r][c1][c2] != -1) return dp[r][c1][c2];

        // This loop runs 9 times for each recursive call, and there can be maximum (m * n * n) recursive call
        // Also here we are memorizing the calculated value, so we are not solving already solved problem again.
        int totalMax = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                totalMax = Math.max(totalMax, backtrack(r + 1, c1 + i, c2 + j, dp, grid));
            }
        }

        if (c1 == c2) {
            dp[r][c1][c2] = grid[r][c1] + totalMax;
        } else {
            dp[r][c1][c2] = grid[r][c1] + grid[r][c2] + totalMax;
        }

        return dp[r][c1][c2];
    }
}
