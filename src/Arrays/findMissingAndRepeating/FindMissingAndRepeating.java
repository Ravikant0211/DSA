//
//// TC: O(N^2) SC: O(1)
//int[] findTwoElement(int arr[], int n) {
//        int[] ans = new int[2];
//        for (int i = 1; i <= n; i++) {
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j] == i) {
//                    count++;
//                }
//            }
//            if (count > 1) {
//                ans[0] = i;
//            } else if (count == 0) {
//                ans[1] = i;
//            }
//        }
//        return ans;
//}
//
//// Better ( Using Hashing )
//// TC: O(N), SC: O(N)
//int[] findTwoElement(int arr[], int n) {
//        int[] map = new int[n + 1];
//        for (int i = 0; i < n; i++) {
//            map[arr[i]] += 1;
//        }
//
//        int[] ans = new int[2];
//        for (int i = 1; i <= n; i++) {
//            if (map[i] == 2) {
//                ans[0] = i;
//            } else if (map[i] == 0) {
//                ans[1] = i;
//            }
//        }
//        return ans;
//}
//
//
//// Optimal solution 1 (Math)
//// TC: O(N) SC: O(1)
//int[] findTwoElement(int arr[], int n) {
//    long sum_n = (long) n * (n + 1) / 2;
//    long sum2_n = (long) n * (n + 1) * (2 * n + 1) / 6;
//    long sum = 0, sum2 = 0;
//
//    for (int i = 0; i < n; i++) {
//        sum += arr[i];
//        sum2 += (long) arr[i] * arr[i];
//    }
//
//    long diff_sum = sum - sum_n; // x - y
//    long diff_sum2 = sum2 - sum2_n;
//
//    long sum_diff = diff_sum2 / diff_sum; // x + y
//
//    long repeating = (diff_sum + sum_diff) / 2;
//    long missing = sum_diff - repeating;
//
//    return new int[]{(int) repeating, (int) missing};
//}
//
