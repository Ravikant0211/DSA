package DynamicProgramming.DpOnGrid.GridUniquePaths2.Optimized;

import java.util.Scanner;

// TIME COMPLEXITY- O(M * N)
// SPACE COMPLEXITY- O(M + N)

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

        int ans = uniquePathsWithObstacles(m, n, grid);
        System.out.println("Unique Paths: " + ans);
    }

    public static int uniquePathsWithObstacles(int m, int n, int[][] grid) {
        if (grid[0][0] == 1) return 0;

        int[] row = new int[n];
        int[] col = new int[m];

        row[0] = 1; col[0] = 1;

        for (int i = 1; i < n; i++) { // filling first row
            row[i] = grid[0][i] == 1 ? 0 : row[i - 1];
        }

        for (int i = 1; i < m; i++) { // filling first column
            col[i] = grid[i][0] == 1 ? 0 : col[i - 1];
        }

        for (int i = 1; i < m; i++) {

            int tmp[] = new int[n];

            for (int j = 1; j < n; j++) {
                if (grid[i][j] == 1) {
                    tmp[j] = 0; col[i] = 0;
                }
                else {
                    tmp[j] = row[j] + col[i];
                    col[i] = tmp[j];
                }
            }

            for (int k = 1; k < n; k++) {
                row[k] = tmp[k];
            }

        }

        if(m == 1) {
            return row[n - 1];
        } else if( n == 1) {
            return col[m - 1];
        }
        return  row[n - 1];
    }
}
