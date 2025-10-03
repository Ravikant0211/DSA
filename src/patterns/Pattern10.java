package patterns;

import java.lang.Math;

public class Pattern10 {
    // TC: O(N^2)
    // SC: O(1)
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= 2*n - 1; i++) {
             for (int j = 1; j <= 2*n - 1; j++) {
                int up = i - 1;
                int down = 2*n - 1 - i;
                int left = j - 1;
                int right = 2*n - 1 - j;
                int cellValue = n - Math.min(Math.min(up, down), Math.min(left, right));
                System.out.print(cellValue + " ");
             }
            System.out.println();
        }
    }
}

// Time complexity = O(2 ^ n) => exponential time complexity
// n = 5 => 32
// n = 10 => 1024

// Time complexity = O(N^3) => n qube time complexity
// 7 * 7 * 7 = 343
// 10 * 10 * 10 = 1000

// Time complexity = O((2n - 1) * (2n - 1)) = O(n^2) => n square time complexity
// 11 * 11 = 121
// 15 * 15 = 225
// 16 * 16 = 256
// 20 * 20 = 400

// Time complexity = O(N)
// 10 = 10
// 50 = 50
// 60 = 60

// Time complexity = O(log N)
// N = 10, log 10 => around 2-3

// O(2 ^ n) > O(n ^ 3) > O(n ^ 2) > O(n) > O(log n) > O(1);



// 11, 11, 11, ......., 11 times
// 11 + 11 + 11 ..... 11 times = 11 * 11 = 121

// i = 1, j = 1, 2, 3, 4, 5, 6, 7, 8,
// i = 2, j = 1, 2, 3, 4, 5
// i = 3, j = 1, 2, 3, 4, 5
// i =



// N = 3

//        3 3 3 3 3
//        3 2 2 2 3
//        3 2 1 2 3
//        3 2 2 2 3
//        3 3 3 3 3

// no. of rows = 2*n - 1 = no.of columns

//n = 3    1 2 3 4 5

// 1       0 0 0 0 0
// 2       0 1 1 1 0
// 3       0 1 2 1 0
// 4       0 1 1 1 0
// 5       0 0 0 0 0

//i = 2, j = 3
// up = 1 -> i - 1
// down = 3 -> 2n - 1 - i
// left = 2 -> j - 1
// right = 2 -> 2n - 1 - j

// i = 3, j = 3
// up = 2
// down = 2
// left = 2
// right = 2

//   n = 6
//        6 6 6 6 6 6 6 6 6 6 6
//        6 5 5 5 5 5 5 5 5 5 6
//        6 5 4 4 4 4 4 4 4 5 6
//        6 5 4 3 3 3 3 3 4 5 6
//        6 5 4 3 2 2 2 3 4 5 6
//        6 5 4 3 2 1 2 3 4 5 6
//        6 5 4 3 2 2 2 3 4 5 6
//        6 5 4 3 3 3 3 3 4 5 6
//        6 5 4 4 4 4 4 4 4 5 6
//        6 5 5 5 5 5 5 5 5 5 6
//        6 6 6 6 6 6 6 6 6 6 6

//        0 0 0 0 0 0 0 0 0 0 0
//        0 1 1 1 1 1 1 1 1 1 0
//        0 1 2 2 2 2 2 2 2 1 0
//        0 1 2 3 3 3 3 3 2 1 0
//        0 1 2 3 4 4 4 3 2 1 0
//        0 1 2 3 4 5 4 3 2 1 0
//        0 1 2 3 4 4 4 3 2 1 0
//        0 1 2 3 3 3 3 3 2 1 0
//        0 1 2 2 2 2 2 2 2 1 0
//        0 1 1 1 1 1 1 1 1 1 0
//        0 0 0 0 0 0 0 0 0 0 0



