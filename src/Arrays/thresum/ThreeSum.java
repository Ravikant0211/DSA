//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//        // TC: O(N^3)
//        // SC: O(1)
//        // List<List<Integer>> ans = new ArrayList<>();
//        // int n = nums.length;
//        // for (int i = 0; i <= n - 3; i++) {
//        //     for (int j = i + 1; j <= n - 2; j++) {
//        //         for (int k = j + 1; k <= n - 1; k++) {
//        //             if (nums[i] + nums[j] + nums[k] == 0) {
//        //                 List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
//        //                 Collections.sort(list);
//        //                 if (!ans.contains(list)) {
//        //                     ans.add(list);
//        //                 }
//        //             }
//        //         }
//        //     }
//        // }
//        // return ans;
//
//
//        // TC: O(N*N) + O(log n)
//        // SC: O(N)
//        // List<List<Integer>> ans = new ArrayList<>();
//        // int n = nums.length;
//        // for (int i = 0; i <= n - 2; i++) {
//        //     Set<Integer> set = new HashSet<>();
//        //     for (int j = i + 1; j<=n-1; j++) {
//        //         int k = -(nums[i] + nums[j]);
//        //         if (set.contains(k)) {
//        //             List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], k));
//        //             Collections.sort(list);
//        //             if (!ans.contains(list)) {
//        //                 ans.add(list);
//        //             }
//        //         }
//        //         set.add(nums[j]);
//        //     }
//        // }
//        // return ans;
//
//        // Optimal- TC: O(n2) + O(nlogn); SC: O(1);
//        Arrays.sort(nums);
//        List<List<Integer>> ans = new ArrayList<>();
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            if (i > 0 && nums[i] == nums[i - 1]) continue;
//            int j = i + 1, k = n - 1;
//            while (j < k) {
//                int sum = nums[i] + nums[j] + nums[k];
//                if (sum < 0) {
//                    j++;
//                } else if (sum > 0) {
//                    k--;
//                } else {
//                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                    j++; k--;
//                    while (j < k && nums[j] == nums[j - 1]) j++;
//                    while (j < k && nums[k] == nums[k + 1]) k--;
//                }
//            }
//        }
//        return ans;
//    }
//}
