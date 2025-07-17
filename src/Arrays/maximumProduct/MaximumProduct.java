package Arrays.maximumProduct;

// problem link - https://leetcode.com/problems/maximum-product-subarray/
public class MaximumProduct {
    public int maxProduct(int[] nums) {
        int curr_product = 1, max_product = Integer.MIN_VALUE;
        for (int num : nums) {
            curr_product *= num;
            max_product = Math.max(curr_product, max_product);
            if (curr_product == 0) {
                curr_product = 1;
            }
        }
        curr_product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            curr_product *= nums[i];
            max_product = Math.max(curr_product, max_product);
            if (curr_product == 0) {
                curr_product = 1;
            }
        }
        return max_product;
    }
}
