package Arrays.bestTimeToBuyAndSellStockOne;

// Problem link - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeToBuySellStock {
    public static void main (String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        int ans = maxiMizeProfit(arr);
        System.out.println(ans);
    }
    public static int maxiMizeProfit(int[] prices) {
        // Optimal Solution - TC: O(N), SC: O(1)
        // int maxiProfit = 0; int mini = prices[0];
        // for (int i = 1; i < prices.length; i++) {
        //     maxiProfit = Math.max(maxiProfit, prices[i] - mini);
        //     mini = Math.min(mini, prices[i]);
        // }
        // return maxiProfit;

        // // Better solution TC: O(N), SC: O(1)
        // int n = prices.length;
        // int diff[] = new int[n - 1];
        // for (int i = 1; i < n; i++) {
        //     diff[i - 1] = prices[i] - prices[i - 1];
        // }

        // int maxSum = 0, currSum = 0;
        // for (int i = 0; i < diff.length; i++) {
        //     currSum += diff[i];
        //     if (currSum < 0) {
        //         currSum = 0;
        //     }
        //     maxSum = Math.max(currSum, maxSum);
        // }
        // return maxSum;

        // Optimal Solution TC: O(N) SC: O(1)
        int maxProfit = 0, currProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            currProfit += prices[i] - prices[i - 1];
            if (currProfit < 0) {
                currProfit = 0;
            }
            maxProfit = Math.max(maxProfit, currProfit);
        }
        return maxProfit;
    }
}
