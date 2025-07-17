public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        // TC: O(N) or O(N*log N)
        // SC: O(N)
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);
        int count = 0, xor = 0;
        for (int a : A) {
            xor = xor ^ a;
            int preXor = xor ^ B;
            count += mpp.getOrDefault(preXor, 0);
            mpp.put(xor, mpp.getOrDefault(xor, 0) + 1);
        }
        return count; 
    }
}
