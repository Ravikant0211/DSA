package removeDuplicates;
import java.util.*;

// Problem link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

public class RemoveDuplicates {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int l = removeDuplicates(nums);
        for (int i = 0; i < l; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static int removeDuplicates(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((i - 1) >= 0 && nums[i] != nums[i - 1]) {
                nums[++idx] = nums[i];
            }
        }
        return idx + 1;
    }
}
