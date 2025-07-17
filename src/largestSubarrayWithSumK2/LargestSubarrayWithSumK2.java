package largestSubarrayWithSumK2;
import java.util.*;

// Problem link- https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_5713505?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
public class LargestSubarrayWithSumK2 {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 1, -1, -1, 0};
        int k = 0;
        int ans = largestSubarrayWithSumK2(arr, k);
        System.out.println(ans);
    }
    public static int largestSubarrayWithSumK2(int[] arr, int k) {
        Map<Long, Integer> mpp = new HashMap<>();
        long sum = 0; int maxL = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) maxL = Math.max(maxL, i + 1);
            long rem = sum - k;
            if (mpp.containsKey(rem)) maxL = Math.max(maxL, i - mpp.get(rem));
            if (!mpp.containsKey(sum)) mpp.put(sum, i);
        }
        return maxL;
    }
}
