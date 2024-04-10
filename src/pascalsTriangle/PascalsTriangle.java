package pascalsTriangle;

import java.util.*;

// problem link- https://leetcode.com/problems/pascals-triangle/description/

public class PascalsTriangle {
    // public int findNcR(int n, int r) {
    //     int res = 1;
    //     for (int i = 0; i < r; i++) {
    //         res = res * (n - i);
    //         res = res / (i + 1);
    //     }
    //     return res;
    // }

    // public List<List<Integer>> generate(int numRows) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     for (int row = 1; row <= numRows; row++) {
    //         List<Integer> list = new ArrayList<>();
    //         for (int col = 1; col <= row; col++) {
    //             int elem = findNcR(row - 1, col - 1);
    //             list.add(elem);
    //         }
    //         ans.add(list);
    //     }
    //     return ans;
    // }

    public List<Integer> generatePascalRow(int rowNumber) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        int ans = 1;
        for (int c = 1; c < rowNumber; c++) {
            ans = ans * (rowNumber - c );
            ans = ans / c;
            list.add(ans);
        }
        return list;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int row = 1; row <= numRows; row++) {
            ans.add(generatePascalRow(row));
        }
        return ans;
    }
}
