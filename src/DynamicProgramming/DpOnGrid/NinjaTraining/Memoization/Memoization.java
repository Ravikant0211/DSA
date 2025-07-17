package DynamicProgramming.DpOnGrid.NinjaTraining.Memoization;

import java.util.Scanner;

public class Memoization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int points[][] = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                points[i][j] = sc.nextInt();
            }
        }

        int ans = NinjasTraining(n, points);
        System.out.println("Maximum Points Earned: " + ans);
    }

    public static int NinjasTraining(int n, int points[][]) {
        int[][] dp = new int[n + 1][4];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < 4; j++) {
                dp[i][j] = -1;
            }
        }
        return backtrack(n, 3, points, dp);
    }

    public static int backtrack(int day, int last, int[][] points, int[][] dp) {
        if (day == 0) return points[day][last];

        if (dp[day][last] != -1) return dp[day][last];

        int maxPoints = 0;
        for (int act = 0; act < 3; act++) {
            if (act != last) {
                int currPoints = last < 3 ? points[day][last] : 0;
                int pnts = currPoints + backtrack(day - 1, act, points, dp);
                maxPoints = Math.max(pnts, maxPoints);
            }
        }

        return dp[day][last] = maxPoints;
    }
}
