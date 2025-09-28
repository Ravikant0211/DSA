package Maths;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         int ans = countDigits(n);
         System.out.println("Answer:" + ans);
    }

    public static int countDigits(int n) {
        int count = 0; // 4
        while(n > 0) { // 0 > 0 => false
            n = n / 10; //
            count = count + 1; // 3 + 1 = 4
        }
        return count;
    }
}

// *****
// *****
// *****
// *****
// *****
// *****
// *****
// *****

// 4357

// 4357 / 10 => 435
// 435 / 10 => 43
// 43 / 10 => 4
// 4 / 10 => 0


// Inputs:
// n = 4357
// output = 4

// n = 100
// output = 3


// n = 15
// output = 2

// n = 3
// output = 1

// 1 <= n <= 10^5
