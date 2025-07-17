package sortingAlgorithms.bubbleSort;

import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        bubble_sort(a, n);
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // Best case TC - O(n^2)
    // Worst/avg case TC - O(n)
    public static void bubble_sort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int didSwap = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
            System.out.println("Run!");
        }
    }

}
