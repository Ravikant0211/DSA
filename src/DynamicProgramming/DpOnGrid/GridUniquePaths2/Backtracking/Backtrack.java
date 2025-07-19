package DynamicProgramming.DpOnGrid.GridUniquePaths2.Backtracking;

import java.util.Scanner;

// PROBLEM LINK= "https://leetcode.com/problems/unique-paths-ii"

// EDGE CASES-
// 1. [[0],[0],[1],[0]]
// 2. [[0,0],[1,1],[0,0]]
// 3. [[0,0, 1, 0, 0]]
// 4. [[1]]
// 5. [[0]]


// TIME COMPLEXITY- O(2 ^ (m + n))
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

        int ans = uniquePathsWithObstacles(m, n, grid);
        System.out.println("Unique Paths: " + ans);
    }

    public static int uniquePathsWithObstacles(int m, int n, int[][] grids) {
        return backtrack(m - 1, n - 1, grids);
    }

    public static int backtrack(int r, int c, int[][] grid) {
        if (r < 0 || c < 0 || grid[r][c] == 1) return 0;

        if (r == 0 && c == 0) return 1;

        return backtrack(r, c - 1, grid) + backtrack(r - 1, c, grid);
    }
 }
