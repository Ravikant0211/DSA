package patterns;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Do not repeat yourself! (DRY)

// n = 4

// ****
// ****
// ****
// ****

// 1. no. of rows = n
// 2. no. of stars in each row = n