package Hashing;

public class isSubset {
    public static void main(String[] args) {
        int[] a = {11, 7, 1, 13, 21, 3, 7, 3};
        int[] b = {11, 3, 7, 1, 7};
        boolean ans = isSubset(a, b);
        System.out.println(ans);
    }

    public static boolean isSubset(int a[], int b[]) {
        for (int i = 0; i < b.length; i++) {
            boolean subset = false;
            for (int j = 0; j < a.length; j++) {
                if (a[j] > 0 && b[i] == a[j]) { // not visited
                    a[j] = 0;
                    subset = true;
                    break;
                }
            }
            if (subset == false) {
                return false;
            }
        }

        return true;
    }
}


//a[] = [-1, 2, 1, 2]
//
//b[] = [1, 1, 3]
//          i
// elements of a and b are positive (Given from constraints)

