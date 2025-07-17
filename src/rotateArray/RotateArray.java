package rotateArray;
import java.util.*;

// Problem link: https://leetcode.com/problems/rotate-array/description/

public class RotateArray {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        rotateArray(nums, k);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        if (k < 0) k = k + n;
        k = k % n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);
    }

    public static void reverse(int[] nums, int i, int j) {
        while (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
}
