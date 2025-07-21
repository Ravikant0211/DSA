package DynamicProgramming.DpOnGrid.MInPathSum.Backtrack;

import java.util.Scanner;

// PROBLEM LINK- 'https://leetcode.com/problems/minimum-path-sum'

// TIME COMPLEXITY- O(2 ^ (m * n))
// SPACE COMPLEXITY- O(m + n)

public class Backtrack {
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
        return backtrack(m - 1, n - 1, grid);
    }

    public static int backtrack(int r, int c, int[][] grid) {
        if (r == 0 && c == 0) return grid[r][c];

        if (r < 0 || c < 0) return Integer.MAX_VALUE;

        int left = backtrack(r, c - 1, grid);
        int right = backtrack(r - 1, c, grid);

        return grid[r][c] + Math.min(left, right);
    }
}
