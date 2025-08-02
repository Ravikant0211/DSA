package DynamicProgramming.DpOnGrid.CherryPick3D.Optimized;

import java.util.Scanner;


// TIME COMPLEXITY: O(9 * (m * n * n)) + O(n * n)

// SPACE COMPLEXITY: O(n * n) => dp array

public class Optimized {
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
        int[][] dp = new int[n][n];

        for (int c1 = 0; c1 < n; c1++) {
            for (int c2 = 0; c2 < n; c2++) {
                if (c1 == c2) {
                    dp[c1][c2] = grid[m-1][c1];
                } else {
                    dp[c1][c2] = grid[m-1][c1] + grid[m-1][c2];
                }
            }
        }

        for (int r = m - 2; r >= 0; r--) {
            int[][] temp = new int[n][n];

            for (int c1 = 0; c1 < n; c1++) {
                for (int c2 = 0; c2 < n; c2++) {

                    int value = 0;
                    if (c1 == c2) {
                        value = grid[r][c1];
                    } else  {
                        value = grid[r][c1] + grid[r][c2];
                    }

                    int maxi = 0;
                    for (int i = -1; i <= 1; i++) {
                        for (int j = -1; j <= 1; j++) {
                            if (c1 + i >= 0 && c1 + i < n && c2 + j >= 0 && c2 + j < n) {
                                maxi = Math.max(maxi, dp[c1 + i][c2 + j]);
                            }
                        }
                    }

                    temp[c1][c2] = maxi + value;
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j] = temp[i][j];
                }
            }

        }

        return dp[0][n-1];
    }
}
