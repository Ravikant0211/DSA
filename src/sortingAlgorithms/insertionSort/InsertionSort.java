package sortingAlgorithms.insertionSort;

import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        insertion_sort(a, n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // Best-TC = O(n)
    // Worst/Avg- TC = O(n^2)
    public static void insertion_sort(int[] a, int n) {
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j-1]) {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }
}
