package DynamicProgramming.DpOnSubsequences.SubsetSum.Optimized;

import java.util.Scanner;

public class Optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ans = isSubsetSum(arr, k);
        System.out.println("Answer: " + ans);
    }

    public static Boolean isSubsetSum(int arr[], int target) {
        int n = arr.length;

        Boolean[] prev = new Boolean[target + 1];

        // Base case formation
        prev[0] = true;


        for (int i = 1; i <= target; i++) {
            prev[i] = false;
        }

        if (arr[0] <= target) {
            prev[arr[0]] = true;
        }

        for (int i = 1; i < n; i++) {

            Boolean curr[] = new Boolean[target + 1];

            curr[0] = true;

            for (int j = 1; j <= target; j++) {

                boolean noTake = prev[j];

                boolean take = false;

                if (j >= arr[i]) {
                    take = prev[j-arr[i]];
                }


                curr[j] = take || noTake;
            }

            // copy prev into curr
            prev = curr;
        }

        return prev[target];
    }
}
