package Arrays.majorityElementSecond;
import java.util.*;

// problem link- "https://leetcode.com/problems/majority-element-ii/description/"

public class MajorityElementTwo {
    public List<Integer> majorityElement(int[] nums) {
        // List<Integer> list = new ArrayList<Integer>();
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     int count = 0, elem = nums[i];
        //     if (!list.contains(elem)) {
        //         for (int j = i; j < n; j++) {
        //             if (nums[j] == elem) count++;
        //         }
        //         if (count > n / 3) {
        //             list.add(elem);
        //         }
        //     }

        //     if (list.size() == 2) {
        //         break;
        //     }
        // }
        // return list;

        // ---------------------------------------------------------------------

        // List<Integer> list = new ArrayList<>();
        // Map<Integer, Integer> mpp = new HashMap<>();

        // for(int a : nums) {
        //     mpp.put(a, mpp.getOrDefault(a, 0) + 1);
        //     if (mpp.get(a) > nums.length/3 && !list.contains(a)) list.add(a);
        //     if (list.size() == 2) break;
        // }
        // return list;

        // -------------------------------------------------------------------------
        int count1 = 0, ele1 = Integer.MIN_VALUE;
        int count2 = 0, ele2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (count1 == 0 && nums[i] != ele2) {
                count1++;
                ele1 = nums[i];
            }
            else if (count2 == 0 && nums[i] != ele1) {
                count2++;
                ele2 = nums[i];
            }
            else if (nums[i] == ele1) {
                count1++;
            }
            else if (nums[i] == ele2) {
                count2++;
            }
            else {
                count1--; count2--;
            }
        }

        List<Integer> list = new ArrayList<>();
        count1 = 0; count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ele1) count1++;
            else if (nums[i] == ele2) count2++;
        }
        if (count1 > nums.length / 3) list.add(ele1);
        if (count2 > nums.length / 3) list.add(ele2);
        return list;
    }
}
