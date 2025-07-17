package Arrays.setMatrixZeroes;

// Problem Link- https://leetcode.com/problems/set-matrix-zeroes/
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,4,5}, {1,0,0,2}, {3,1,0,4}, {2,1,5,6}};
        setMatrixZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void setMatrixZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        // dicide to make first element zero
        boolean setFirstRow = false;
        boolean setFirstCol = false;
        for (int i = 0; i < r; i++) {
            if (matrix[i][0] == 0) {
                setFirstCol = true;
                break;
            }
        }

        for (int j = 0; j < c; j++) {
            if (matrix[0][j] == 0) {
                setFirstRow = true;
                break;
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = r - 1; i >=1; i--) {
            for (int j = c - 1; j >= 1; j--) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (setFirstRow) {
            for (int j = 0; j < c; j++) {
                matrix[0][j] = 0;
            }
        }
        if (setFirstCol) {
            for (int i = 0; i < r; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}

//##################################################################

// BRUTE FORCE APPROACH
//public static void Arrays.setMatrixZeroes(int[][] matrix) {
//    int r = matrix.length;
//    int c = matrix[0].length;
//    int[][] copy = new int[r][c];
//    for (int i = 0; i < r; i++) {
//        for (int j = 0; j < c; j++) {
//            copy[i][j] = matrix[i][j];
//        }
//    }
//
//    for (int i = 0; i < r; i++) {
//        for (int j = 0; j < c; j++) {
//            if (matrix[i][j] == 0) {
//                setRow(copy, i);
//                setCol(copy, j);
//            }
//        }
//    }
//
//    for (int i = 0; i < r; i++) {
//        for (int j = 0; j < c; j++) {
//            matrix[i][j] = copy[i][j];
//        }
//    }
//}
//
//    public static void setRow(int[][] arr, int row) {
//        for (int i = 0; i < arr[0].length; i++) {
//            arr[row][i] = 0;
//        }
//    }
//
//    public static void setCol(int[][] arr, int col) {
//        for (int i = 0; i < arr.length; i++) {
//            arr[i][col] = 0;
//        }
//    }

//#####################################################################
//BETTER APPROACH
//public static void Arrays.setMatrixZeroes(int[][] matrix) {
//    int r = matrix.length;
//    int c = matrix[0].length;
//    int[] col = new int[c];
//    int[] row = new int[r];
//
//    for (int i = 0; i < r; i++) {
//        for (int j = 0; j < c; j++) {
//            if (matrix[i][j] == 0) {
//                row[i] = 1;
//                col[j] = 1;
//            }
//        }
//    }
//
//    for (int i = 0; i < r; i++) {
//        for (int j = 0; j < c; j++) {
//            if (row[i] == 1 || col[j] == 1) {
//                matrix[i][j] = 0;
//            }
//        }
//    }
//}
