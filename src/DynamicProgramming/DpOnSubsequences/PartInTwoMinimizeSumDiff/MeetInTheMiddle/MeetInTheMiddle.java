package DynamicProgramming.DpOnSubsequences.PartInTwoMinimizeSumDiff.MeetInTheMiddle;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// TIME COMPLEXITY: n = N / 2
//      O(N) -> For calculating the sum of nums array
//      O(n) -> For creating left and right List<List<Integer>>
//      O(n * (2^n)) -> For creating subsets
//      O(n * log(n)) * O(n) -> For sorting the right List<List<Integer>>
//      O(n * n * log n) => for iterating over left partition and doing binary_search on right partition.

public class MeetInTheMiddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int ans = minimumDifference(nums);
        System.out.println("Answer: " + ans);
    }

    public static int minimumDifference(int[] nums) {
        int N = nums.length;
        int n = N / 2;

        // Calculate Total Sum of the nums array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // Create two partitions array left and right of size n
        List<List<Integer>> left = new ArrayList<>();
        List<List<Integer>> right = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            left.add(new ArrayList<>());
            right.add(new ArrayList<>());
        }

        // nums = [2,-1,0,4,-2,-9]
        // System.out.println(left); // [[], [], [], []]
        // System.out.println(right); // [[], [], [], []]

        // Create Subsets of both left and right partitions, and store the sum of those subsets
        // into there corresponding list on index sz.
        for (int mask = 0; mask < (1 << n); mask++) {
            int sz = 0, l = 0, r = 0;
            for (int i = 0; i < n; i++) {
                if (((mask >> i) & 1) == 1) {
                    sz++;
                    l += nums[i];
                    r += nums[i + n];
                }
            }

            left.get(sz).add(l);
            right.get(sz).add(r);
        }

        // Handle edge case
        int res = Math.min(
                Math.abs(totalSum - 2 * left.get(n).get(0)),
                Math.abs(totalSum - 2 * right.get(n).get(0))
        );


        // sort the right List<List<Integer>> for efficient searching (lower_bound)
        for (int rsz = 0; rsz <= n; rsz++) {
            if (!right.get(rsz).isEmpty()) {
                Collections.sort(right.get(rsz));
            }
        }

        // nums = [2,-1,0,4,-2,-9]
        // System.out.println(left); // [[0], [2, -1, 0], [1, 2, -1], [1]]
        // System.out.println(right); // [[0], [-9, -2, 4], [-11, -5, 2], [-7]]

        // Iterate over left List<List<Integer>>, and for each 'a' find its corresponding 'b' in right
        // List<List<Integer>> and find the minimum sum difference.
        for (int sz = 1; sz < n; sz++) {
            for (int a : left.get(sz)) {
                int b = (totalSum - 2 * a) / 2;

                List<Integer> rl = right.get(n - sz);

                int idx = lower_bound(rl, b);

                if (idx < rl.size()) {
                    res = Math.min(res, Math.abs(totalSum - 2 * (a + rl.get(idx))));
                }

                if (idx > 0) {
                    res = Math.min(res, Math.abs(totalSum - 2 * (a + rl.get(idx - 1))));
                }

            }
        }

        return res;
    }

    public static int lower_bound(List<Integer> list, int target) {
        int lo = 0, hi = list.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (list.get(mid) >= target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
