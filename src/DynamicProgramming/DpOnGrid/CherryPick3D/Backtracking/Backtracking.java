package DynamicProgramming.DpOnGrid.CherryPick3D.Backtracking;

import java.util.Scanner;

// TIME COMPLEXITY: O(9 ^ (m * n * n))
// 9 * 9 * 9 * 9 ......... * (m * n * n) times.

// SPACE COMPLEXITY: O(M) => recursive stack space, since on each recursive call we travel one row

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

        int ans = cherryPickup(grid);
        System.out.println("Answer: " + ans);
    }

    public static int cherryPickup(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        return backtrack(0, 0, n - 1, grid, m, n);
    }

    public static int backtrack(int r, int c1, int c2, int[][] grid, int m, int n) {
        if (c1 < 0 || c2 < 0 || c2 >= n || c1 >= n) return 0;
        if (r == m - 1) {
            if (c1 == c2) return grid[r][c1];
            else return grid[r][c1] + grid[r][c2];
        }

        // This loops runs 9 times for each recursive call, and there can be maximum (n * m * m) repeated calls.
        int totalMax = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                totalMax = Math.max(totalMax, backtrack(r + 1, c1 + i, c2 + j, grid, m, n));
            }
        }

        if (c1 == c2) return grid[r][c1] + totalMax;
        return grid[r][c1] + grid[r][c2] + totalMax;
    }
}
