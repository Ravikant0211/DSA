package Arrays.majorityElement;

// Problem Link- https://leetcode.com/problems/majority-element/submissions/1199857812/
public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
    public static int majorityElement(int[] nums) {
        int count = 0, ele = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count++;
                ele = nums[i];
            }
            else if (nums[i] == ele) count++;
            else count--;
        }
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ele) count2++;
        }
        return count2 > nums.length / 2 ? ele : Integer.MIN_VALUE;
    }
}
