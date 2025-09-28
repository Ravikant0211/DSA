package patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n) {
                    System.out.print('*');
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// n = 7

//*           0
//**          0
//* *         1
//*  *        2
//*   *       3
//*    *      4
//*******     0

// approach:
// 1. In case of first and last column and last row always print '*', or else print spaces.

