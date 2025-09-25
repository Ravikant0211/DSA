package patterns;

public class Pattern3 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            int spaces = (n - i);
            int stars = (2*i - 1);
            // print space
            for (int j = 1; j <= spaces; j++) {
                System.out.print(' ');
            }

            // print stars
            for (int k = 1; k <= stars; k++) {
                System.out.print('*');
            }

            // switch to next line
            System.out.println();
        }
    }
}

// N = 6

//1.      *         1   5
//2.     ***        3   4
//3.    *****       5   3
//4.   *******      7   2
//5.  *********     9   1
//6. ***********    11  0


// Observation-
// 1. no of rows to be printed equal to n
// 2. no. of stars in each row = (current row number + previous row number)
//                             = i + i - 1 = (2*i - 1) = (2 * current_row_number - 1)
// 3. no. of spaces in each row = (n - i)

// Approach-
// 1. Run outer loop from i = 1 to n
// 2. Run 1st inner loop to print the spaces
// 3. Run 2nd inner loop to print the stars
