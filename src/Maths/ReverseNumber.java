package Maths;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 4356;
        int ans = reverseNumber(n);
        System.out.println("Answer:" + ans);
    }

    public static int reverseNumber(int n) {
        int reverse = 0;
        while (n > 0) {
            int rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        return reverse;
    }
}

// n = 1234

// reverse = 0;

// reverse = reverse * 10 + rem;
// reverse = 0 * 10 + 4 = 4
// reverse = 4 * 10 + 3 = 43
// reverse = 43 * 10 + 2 = 430 + 2 = 432
// reverse = 432 * 10 + 1 = 4320 + 1 = 4321



// rem = 1234 % 10 = 4
// n = 1234 / 10 = 123

// rem = 123 % 10 = 3
// n = 123 / 10 = 12

// rem = 12 % 10 = 2
// n = 12 / 10 = 1

// rem = 1 % 10 = 1
// n = 1 / 10 = 0

// ___________________________________

// n = 1234
//output = 4321

// n = 1000
//output = 0001 = 1

// approach
// int start = 4, start = 3
// int end = 1, end = 2

