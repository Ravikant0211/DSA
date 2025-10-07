package Hashing;

public class NonRepetetive {
    public static void main(String[] args) {
        int[] arr = { -1, 2, -1, 3, 2, -1, 2, 4 };
        int n = arr.length;
        int ans = nonRepeating(arr, n);
        System.out.println(ans);
    }

    public static int nonRepeating(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate == false) {
                return arr[i];
            }
        }

        return 0;
    }
}
