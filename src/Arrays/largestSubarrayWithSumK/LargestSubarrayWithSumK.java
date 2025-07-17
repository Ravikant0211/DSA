package Arrays.largestSubarrayWithSumK;
import java.util.*;
// Problem link: https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

public class LargestSubarrayWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = largestSubarrayWithSumK(arr, k);
        System.out.println(ans);
    }
    public static int largestSubarrayWithSumK(int[] a, int k) {
        long sum = 0; int maxi = 0, j = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            while(sum > k) sum = sum - a[j++];
            if (sum == k) maxi = Math.max(maxi, i-j+1);
        }
        return maxi;
    }
}
