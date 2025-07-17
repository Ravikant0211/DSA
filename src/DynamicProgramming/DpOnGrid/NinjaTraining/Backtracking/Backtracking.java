package DynamicProgramming.DpOnGrid.NinjaTraining.Backtracking;

import java.util.Scanner;

public class Backtracking {
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

    public static int NinjasTraining(int n, int[][] points) {
        return backtrack(n, 3, points);
    }

    public static int backtrack(int day, int last, int[][] points) {
        if (day == 0) return points[day][last];

        int maxPoints = 0;
        for (int act = 0; act < 3; act++) {
            if (act != last) {
                int currPoints = last < 3 ? points[day][last] : 0;
                int pnts = currPoints + backtrack(day - 1, act, points);
                maxPoints = Math.max(pnts, maxPoints);
            }
        }

        return maxPoints;
    }
}
