package patterns;

public class Pattern4 {
    public static void main(String[] args) {

        int n = 8;
        for (int i = 1; i <= n; i++) {
             int start;
             if (i % 2 == 0) { // even row number
                 start = 0;
             } else {
                 start = 1;
             }

             for (int j = 1; j <= i; j++) {
                 if (start == 1) {
                     if (j % 2 == 1) { // if j is odd
                         System.out.print('1');
                     } else { // if j is even
                         System.out.print('0');
                     }
                 } else {
                     if (j % 2 == 1) { // if j is odd
                         System.out.print('0');
                     } else { // if j is even
                         System.out.print('1');
                     }
                 }
             }

             // next line
            System.out.println();
        }
    }
}





// n = 6, j=123456
//1.        1
//2.        01
//3.        101
//4.        0101 -> start = 0
//5.        10101 -> start = 1
//6.        010101

// Observations
// 1. In odd rows, it starts from 1.
// 2. In even rows, it starts from 0. Estimation of even rows = start element of odd row - 1

// if i % 2 == 0, start from 1.
// else start from 0.



// n = 6

//         *
//         **
//         ***
//         ****
//         *****
//         ******
// ---------------------
// n - 1 = 5
//         *****
//         ****
//         ***
//         **
//         *


