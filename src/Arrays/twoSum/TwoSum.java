package Arrays.twoSum;
import java.util.*;

//problem link - https://leetcode.com/problems/two-sum/

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {11, 2, 15, 7};
        int target = 9;
        int ans[] = twoSum(arr, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        // for (int i = 0; i < nums.length - 1; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if ((nums[i] + nums[j]) == target) {
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[0];

        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (mpp.containsKey(rem)) {
                return new int[]{mpp.get(rem), i};
            }
            mpp.put(nums[i], i);
        }
        return new int[0];
    }
}
