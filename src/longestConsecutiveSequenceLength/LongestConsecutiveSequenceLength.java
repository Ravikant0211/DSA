package longestConsecutiveSequenceLength;

// Problem link- https://leetcode.com/problems/longest-consecutive-sequence/description/
public class LongestConsecutiveSequenceLength {
//    public int longestConsecutive(int[] nums) {
//        if (nums.length == 0) return 0;
//        int count = 1, maxCount = 0;
//        Arrays.sort(nums);
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] - nums[i - 1] == 1) {
//                count++;
//            } else if (nums[i] == nums[i - 1]) {
//
//            }
//            else {
//                maxCount = Math.max(count, maxCount);
//                count = 1;
//            }
//        }
//        return Math.max(count, maxCount);
//    }

// #########################################################
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int maxLength = -1;
        for (int el : set) {
            int start = el;
            int end = start + 1;
            if (!set.contains(start - 1)) {
                while (set.contains(end)) {
                    end++;
                }
            }
            maxLength = Math.max(maxLength, end - start);
        }
        return maxLength;
    }
}
