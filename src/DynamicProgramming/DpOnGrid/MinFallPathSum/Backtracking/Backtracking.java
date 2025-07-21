package DynamicProgramming.DpOnGrid.MinFallPathSum.Backtracking;

import java.util.Scanner;

// PROBLEM LINK= 'https://leetcode.com/problems/minimum-falling-path-sum/description/'

// TIME COMPLEXITY = O(3^M)
// SPACE COMPLEXITY = O(M), for recursive stack space

public class Backtracking {
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

        int totalMinSum = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int minSum = backtrack(m - 1, i, mat);
            totalMinSum = Math.min(minSum, totalMinSum);
        }

        return totalMinSum;
    }

    public static int backtrack(int r, int c, int[][] mat) {
        if (c < 0 || c >= mat[0].length) return Integer.MAX_VALUE;

        if (r == 0) return mat[r][c];

        int left = backtrack(r - 1, c - 1, mat);
        int down = backtrack(r - 1, c, mat);
        int right = backtrack(r - 1, c + 1, mat);

        return mat[r][c] + Math.min(left, Math.min(down, right));
    }
}
