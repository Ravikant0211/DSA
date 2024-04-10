package spiralMatrix;
import java.util.*;

// problem link- https://leetcode.com/problems/spiral-matrix/description/
public class SpiralMatrix {
        public List<Integer> spiralOrder(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int top = 0, bottom = m - 1;
            int right = n - 1, left = 0;

            List<Integer> list = new ArrayList<>();
            while (left <= right && top <= bottom) {
                for (int i = left; i <= right; i++) {
                    list.add(matrix[top][i]);
                }
                top++;

                for (int i = top; i <= bottom; i++) {
                    list.add(matrix[i][right]);
                }
                right--;

                if (top <= bottom) {
                    for (int i = right; i >= left; i--) {
                        list.add(matrix[bottom][i]);
                    }
                    bottom--;
                }

                if (left <= right) {
                    for (int i = bottom; i >= top; i--) {
                        list.add(matrix[i][left]);
                    }
                    left++;
                }
            }
            return list;
        }
}
