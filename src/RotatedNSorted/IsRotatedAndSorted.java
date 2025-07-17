package RotatedNSorted;
import java.util.*;

// Problem link - https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

public class IsRotatedAndSorted {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        boolean ans = isRotatedAndSorted(nums);
        System.out.println(ans);
    }
    public static boolean isRotatedAndSorted(int[] nums) {
        int bp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1)%nums.length]) bp++;
        }
        return bp <= 1;
    }
}
