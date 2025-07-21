package DynamicProgramming.DpOnGrid.MinFallPathSum.Optimized;

import java.util.Scanner;

// Time complexity = O(M * N)
// Space complexity = O(2 * N)

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

        int ans = minFallingPathSum(m, n, grid);
        System.out.println("Minimum Path Sum: " + ans);
    }

    public static int minFallingPathSum(int m, int n, int[][] mat) {

        int[] dp = new int[n];

        int totalMinSum = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            int[] temp = new int[n];

            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    dp[j] = mat[i][j];
                    temp[j] = mat[i][j];
                }  else {
                    int left = j > 0 ? dp[j - 1] : Integer.MAX_VALUE;
                    int right = j < n - 1 ? dp[j + 1] : Integer.MAX_VALUE;
                    int up = dp[j];
                    temp[j] = mat[i][j] + Math.min(left, Math.min(up, right));
                }
            }

            for (int k = 0; k < n; k++) {
                dp[k] = temp[k];
            }

        }

        for (int i = 0; i < n; i++) {
            totalMinSum = Math.min(dp[i], totalMinSum);
        }

        return totalMinSum;
    }
}
