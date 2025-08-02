package Binary_Search.BS_1D_Array.Upper_Bound;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = upperBound(nums, k);
        System.out.println("Answer: " + ans);
    }

    public static  int upperBound(int[] arr, int target) {
        // code here
        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] <= target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }

        return lo;
    }
}