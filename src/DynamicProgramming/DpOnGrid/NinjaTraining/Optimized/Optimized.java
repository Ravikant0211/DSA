package DynamicProgramming.DpOnGrid.NinjaTraining.Optimized;

import java.util.Scanner;

public class Optimized {
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
        int[] dp = new int[3];

        int totalMaxPoints = 0;

        for (int act = 0; act < 3; act++) {
            dp[act] = points[0][act];
            totalMaxPoints = Math.max(totalMaxPoints, dp[act]);
        }

        for (int day = 1; day < n; day++) {

            int[] temp = new int[3];

            for (int act = 0; act < 3; act++) {
                temp[act] = solve(day, act, points, dp);
                totalMaxPoints = Math.max(temp[act], totalMaxPoints);
            }

            for (int i = 0; i < 3; i++) {
                dp[i] = temp[i];
            }
        }

        return totalMaxPoints;
    }

    public static int solve(int day, int act, int[][] points, int[] dp) {

        int maxPoints = 0;

        for (int lastAct = 0; lastAct < 3; lastAct++) {
            if (act != lastAct) {
                int pnts = points[day][act] + dp[lastAct];
                maxPoints = Math.max(maxPoints, pnts);
            }
        }

        return maxPoints;
    }
}
