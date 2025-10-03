package Hashing;

public class Basic {
    // Time complexity: O(n * m), square time complexity
    // Space complexity: O(1), Constant space complexity

    public static void main(String[] args) {
                    //0  1  2  3  4  5  6  7  8  9  10 11 12
        int[] arr = { 1, 2, 2, 3, 2, 1, 2, 1, 3, 4, 4, 2, 1 }; // length -> m
        int[] Q = { 1, 3, 4, 2, 10, 1, 1, 1, 1, 1, 4, 4, 2 }; // length -> n

        for (int i = 0; i < Q.length; i++) {
            int count = countElements(arr, Q[i]);
            System.out.println(count);
        }
    }

    public static int countElements (int[] arr, int q) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            // agar ith index pe 1 hai to count badhado
            if (arr[i] == q) {
                count = count + 1;
            }
        }
        return count;
    }
}

// Questions 1: Given an array of integers: [1, 2, 1, 3, 2] find the number of times 1 appear.

// Question: Given an array of integers: [1, 2, 1, 3, 2] and we are given some queries: [1, 3, 4, 2, 10].
// For each query, we need to find out how many times the number appears in the array. For example,
// if the query is 1 our answer would be 2, and if the query is 4 the answer will be 0.


// Hashing => We store results in form of key value pairs. The keys should be unique, the values can be anything.

// We make use of Map data structure to store values in key value form
// Map data structures offers constant time O(1) lookups.
// Map data structure, usually, takes O(1) time to insert, delete, update a result, But it can
// take O(log n) time complexity in worst case.

// Map<Integer, Integer> map = new HashMap<>();
// map.put(key, value); // This is the method to store results
// map.get(key); // This is the method to retrieve the value associated with a key
// map.size() // Give the size of the Map
// map.isEmpty() // Tells if the map is empty (true/false)



// key value
//  1    5
//  2    4
//  3    2
//  4    2
// 10    0

// hash.get(4) = 2
// hash.get(3) = 2