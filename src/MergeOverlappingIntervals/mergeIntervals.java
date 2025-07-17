

public class Solution {
    public int[][] merge(int[][] intervals) {
        // Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> res = new ArrayList<>();

        for (int[] interval : intervals) {
            if (res.isEmpty() || interval[0] > res.get(res.size() - 1)[1])
                res.add(new int[]{interval[0], interval[1]});
            else 
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], interval[1]);
        }

        return res.toArray(new int[res.size()][]);
    }
}

// Changed List<Integer[]> to List<int[]>.
// Added new int[res.size()][] as an argument to the toArray method to ensure proper conversion from List<int[]> to int[][].
// Used Integer.compare(a[0], b[0]) instead of a[0] - b[0] to avoid potential overflow issues
