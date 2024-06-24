// Artical on this problem- https://leetcode.com/problems/reverse-pairs/solutions/97268/general-principles-behind-problems-similar-to-reverse-pairs



// OPTIMAL SOLN- 
// TC: O(2nlogn)
// SC: O(n)
class Solution {
    public int countReversePairs(int[] nums, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) nums[i] > (long) 2 * nums[right]) right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }
    public int mergeSort(int[] nums, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high) / 2 ;
        cnt += mergeSort(nums, low, mid);  // left half
        cnt += mergeSort(nums, mid + 1, high); // right half
        cnt += countReversePairs(nums, low, mid, high); //Modification
        merge(nums, low, mid, high);  // merging sorted halves
        return cnt;
    }
    public void merge(int[] nums, int low, int mid, int high) {
         int temp[] = new int[high - low + 1];
        int left = low, right = mid + 1, i = 0;
        
     
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[i++] = nums[left++];
            } else {
                temp[i++] = nums[right++];
            }
        }
        
        while (left <= mid) {
            temp[i++] = nums[left++];
        }
        
        while (right <= high) {
            temp[i++] = nums[right++];
        }
        
        for (i = low; i <= high; i++) {
            nums[i] = temp[i - low];
        }
    }
    public int reversePairs(int[] nums) {
       return mergeSort(nums, 0, nums.length - 1);
    }
}
