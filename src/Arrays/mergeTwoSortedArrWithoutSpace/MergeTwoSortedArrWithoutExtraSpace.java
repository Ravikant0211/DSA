class Solution {
    public void swapIfGreater(int[] nums1, int[] nums2, int idx1, int idx2) {
        if (nums1[idx1] > nums2[idx2]) {
            int temp = nums1[idx1];
            nums1[idx1] = nums2[idx2];
            nums2[idx2] = temp;
        }
    }

    // Time Complexity: O((n+m)*log(n+m))
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n;
        int gap = len / 2 + len % 2;
        while (gap > 0) {
            int l = 0;
            int r = l + gap;
            while (r < len) {
                if (l < m && r >= m) { // nums1 && nums2
                    swapIfGreater(nums1, nums2, l, r - m);
                } else if (l >= m) { // nums2
                    swapIfGreater(nums2, nums2, l - m, r -  m);
                }  else { // nums1
                    swapIfGreater(nums1, nums1, l, r);
                }
                l++; r++;
            }
            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }


        for(int i = m; i < len; i++) {
            nums1[i] = nums2[i - m];
        }
    }
}
