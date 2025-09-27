package patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

// i = 1 2 3 4 5 6
// i = 1, *
// i = 2, **
// i = 3, ***
// i = 4, ****
// i = 5, *****
// i = 6, ******
// i = 7,
// i = 1, *****
// i = 2, ****
// i = 3, ***
// i = 4, **
// i = 5, *