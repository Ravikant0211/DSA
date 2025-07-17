package DynamicProgramming.DpOnGrid.NinjaTraining.Tabulation;

import java.util.Scanner;

public class Tabulation {
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
        int[][] dp = new int[n][3];

        int totalMaxPoints = 0;

        for (int act = 0; act < 3; act++) {
            dp[0][act] = points[0][act];
            totalMaxPoints = Math.max(totalMaxPoints, dp[0][act]);
        }

        for (int day = 1; day < n; day++) {
            for (int act = 0; act < 3; act++) {
                int pnts = solve(day, act, points, dp);
                totalMaxPoints = Math.max(totalMaxPoints, pnts);
            }
        }

        return totalMaxPoints;
    }

    public static int solve(int day, int act, int[][] points, int[][] dp) {

        int maxPoints = 0;

        for (int lastAct = 0; lastAct < 3; lastAct++) {
            if (act != lastAct) {
                int pnts = points[day][act] + dp[day - 1][lastAct];
                maxPoints = Math.max(pnts, maxPoints);
            }
        }

        return dp[day][act] = maxPoints;
    }
}
