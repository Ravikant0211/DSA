package DynamicProgramming.DpOnGrid.MInPathSum.Optimized;

import java.util.Scanner;

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

        int ans = minPathSum(m, n, grid);
        System.out.println("Minimum Path Sum: " + ans);
    }

    public static int minPathSum(int m, int n, int[][] grid) {

        int[] row = new int[n];
        int[] col = new int[m];

        row[0] = grid[0][0];
        col[0] = grid[0][0];

        for (int c = 1; c < n; c++) { // filling the first row
            row[c] = row[c - 1] + grid[0][c];
        }

        for (int r = 1; r < m; r++) { // filling the first column
            col[r] = col[r - 1] + grid[r][0];
        }

        for (int i = 1; i < m; i++) {
            int[] tmp = new int[n];
            for (int j = 1; j < n; j++) {
                tmp[j] = grid[i][j] + Math.min(row[j], col[i]);
                col[i] = tmp[j];
            }

            for (int k = 0; k < n; k++) {
                row[k] = tmp[k];
            }
        }

        if (n == 1) { // only one column
            return col[m - 1];
        }

        // if only one row or complete grid
        return row[n - 1];
    }
}
