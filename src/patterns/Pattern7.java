package patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            int space = 2 * (n - i - 1);
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }

            // print space
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }

            // print right numbers
            for (int m = i + 1; m > 0; m--) {
                System.out.print(m);
            }
            System.out.println();
        }
    }
}

// N = 6

//        1          1 => 10
//        12        21 => 8
//        123      321 => 6
//        1234    4321
//        12345  54321
//        123456654321
