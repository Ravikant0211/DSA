package DynamicProgramming.DpOnGrid.CherryPick3D.Tabulation;

import java.util.Scanner;

// TIME COMPLEXITY: O(9 * (m * n * n)) + O(n * n)

// SPACE COMPLEXITY: O(m * n * n) => dp array

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

        int ans = cherryPickup(grid);
        System.out.println("Answer: " + ans);
    }

    public static int cherryPickup(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][][] dp = new int[m][n][n];

        // This loop runs (n * n) times
        for (int c1 = 0; c1 < n; c1++) {
            for (int c2 = 0; c2 < n; c2++) {
                if (c1 == c2) {
                    dp[m-1][c1][c2] = grid[m-1][c1];
                } else {
                    dp[m-1][c1][c2] = grid[m-1][c1] + grid[m-1][c2];
                }
            }
        }

        // This loop runs (m * n * n) * 9 times
        for (int r = m - 2; r >= 0; r--) {
            for (int c1 = 0; c1 < n; c1++) {
                for (int c2 = 0; c2 < n; c2++) {

                    int value = 0;
                    if (c1 == c2) {
                        value = grid[r][c1];
                    } else  {
                        value = grid[r][c1] + grid[r][c2];
                    }

                    // This loop runs 9 times
                    int maxi = 0;
                    for (int i = -1; i <= 1; i++) {
                        for (int j = -1; j <= 1; j++) {
                            if (c1 + i >= 0 && c1 + i < n && c2 + j >= 0 && c2 + j < n) {
                                maxi = Math.max(maxi, dp[r + 1][c1 + i][c2 + j]);
                            }
                        }
                    }

                    dp[r][c1][c2] = maxi + value;
                }
            }
        }

        return dp[0][0][n-1];
    }
}
