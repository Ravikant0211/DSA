package patterns;

import java.lang.Math;

public class Pattern10 {
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

// i = 1, j = 1, 2, 3, 4, 5
// i = 2, j = 1, 2, 3, 4, 5



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



