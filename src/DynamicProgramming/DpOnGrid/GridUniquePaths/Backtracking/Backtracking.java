package DynamicProgramming.DpOnGrid.GridUniquePaths.Backtracking;

import java.util.Scanner;

// PROBLEM LINK= 'https://leetcode.com/problems/unique-paths/'

public class Backtracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int ans = uniquePaths(m, n);
        System.out.println("Unique Paths: " + ans);
    }

    public static int uniquePaths(int m, int n) {
        return backtrack(m - 1, n - 1);
    }

    public static int backtrack(int r, int c) {
        if (r == 0 && c == 0) return 1;
        if (r < 0 || c < 0) return 0;
        return backtrack(r, c - 1) + backtrack(r - 1, c);
    }
}
