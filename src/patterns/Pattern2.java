package patterns;

public class Pattern2 {
    public static void main(String[] args) {
        int n = 6;
        // i = 5
        for (int i = 1; i <= n; i++) {
            // j = 1 to 5
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// n = 6
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5 -> i = row number = 5
//1 2 3 4 5 6

// Observations
// 1. Print the digit same as the number of column
// 2. Spaces are increasing as the number of columns increases.
// 3. No. of elements to be printed in each row are equal to the number of row.

// Approach ??
// 1. Run a outer loop from i = 1 to n
// 2. Run a inner loop from j = 1 to i

// i = 1 -> 1
// i = 2 -> 1 2
// i = 3 -> 1 2 3

// i = 6 -> 1 2 3 4 5 6



