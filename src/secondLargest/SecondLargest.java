package secondLargest;

// problem statement:
// You have been given an array ‘a’ of ‘n’ unique non-negative integers.
//Find the second largest and second smallest element from the array.
//Return the two elements (second largest and second smallest) as another array of size 2.
//Example :
//Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
//Output: [4, 2]
//
//The second largest element after 5 is 4, and the second smallest element after 1 is 2.
// Expected Time Complexity:
//O(n), Where ‘n’ is the size of an input array ‘a’.
//Constraints:
//2 ≤ 'n' ≤ 10^5
//0 ≤ 'a'[i] ≤ 10^9

import java.util.*;
public class SecondLargest {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {4, 9, 3, 6, 7};
        int ans[] = second_largset_smallest(arr, n);
        for (int i = 0; i < 2; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] second_largset_smallest(int a[], int n) {
        int largest = -1, second_largest = -2;
        int smallest = Integer.MAX_VALUE, second_smallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] > largest) {
                second_largest = largest;
                largest = a[i];
            } else if (a[i] < largest) {
                second_largest = Math.max(second_largest, a[i]);
            }

            if (a[i] < smallest) {
                second_smallest = smallest;
                smallest = a[i];
            } else if (a[i] > smallest) {
                second_smallest = Math.min(second_smallest, a[i]);
            }
        }

        int temp[] = { second_largest, second_smallest };
        return temp;
    }
}
