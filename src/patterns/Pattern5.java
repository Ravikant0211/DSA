package patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}



// How to Debug?

// i -> 1 2 3 4 5
// for i = 0, j = 1 2 3 4 5 => *****
// for i = 1, j = 1 2 3 4 => ****
// for i = 2, j = 1 2 3 => ***
// for i = 3, j = 1 2 => **
// for i = 4, => j = 1 => *
