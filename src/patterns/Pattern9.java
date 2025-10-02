package patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            int space = 2*(n - i) - 1;

            int left = n;
            for (int j = 1; j <= i; j++) {
               System.out.print(left--);
            }

            // print space
            for (int k = 1; k <= space; k++) {
                System.out.print(left + 1);
            }

            // print right number
            int right = left + 1;
            int ii = i;
            if (i == n) {
                right = left + 2;
                ii = i - 1;
            }
            for (int m = 1; m <= ii; m++) {
                System.out.print(right++);
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) { // 5
            int space = 2*(n - i) - 1;

            int left = n;
            for (int j = 1; j <= i; j++) {
                System.out.print(left--);
            }

            // print space
            for (int k = 1; k <= space; k++) {
                System.out.print(left + 1);
            }

            // print right number
            int right = left + 1;
            int ii = i;
            if (i == n) {
                right = left + 2;
                ii = i - 1;
            }
            for (int m = 1; m <= ii; m++) {
                System.out.print(right++);
            }
            System.out.println();
        }
    }
}

//1. No of columns = 2 * n - 1
//2. No of rows = n

// N = 3

//        3 3 3 3 3
//        3 2 2 2 3
//        3 2 1 2 3
//        3 2 2 2 3
//        3 3 3 3 3

// N = 6
//                                    space => 2*N - 2*i - 1
//        6 6 6 6 6 6 6 6 6 6 6         9
//        6 5 5 5 5 5 5 5 5 5 6         7
//        6 5 4 4 4 4 4 4 4 5 6         5
//        6 5 4 3 3 3 3 3 4 5 6         3
//        6 5 4 3 2 2 2 3 4 5 6         1
//        6 5 4 3 2 1 2 3 4 5 6         0


// 5       6 5 4 3 2 2 2 3 4 5 6         1
// 4       6 5 4 3 3 3 3 3 4 5 6         3
// 3       6 5 4 4 4 4 4 4 4 5 6         5
// 2       6 5 5 5 5 5 5 5 5 5 6         7
// 1       6 6 6 6 6 6 6 6 6 6 6         9

// Implementation of the following problem-
// N = 6

//        1          1 => 10
//        12        21 => 8
//        123      321 => 6
//        1234    4321
//        12345  54321
//        123456654321
