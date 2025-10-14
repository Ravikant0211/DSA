package Hashing;

import java.util.HashMap;
import java.util.Map;

public class NonRepetetive {
    public static void main(String[] args) {
        int[] arr = { -1, 2, -1, 3, 2, -1, 2, 4 };
        int n = arr.length;
        int ans = nonRepeating(arr, n);
        System.out.println(ans);
    }

    public static int nonRepeating(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int value = map.get(arr[i]); // frequency of arr[i]
                map.put(arr[i], value + 1);
            } else {
                map.put(arr[i], 1); // map.put(2, 1)
            }
        }

//        System.out.println(map);

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
//            System.out.println(pair);
//            System.out.println("key:" + pair.getKey() + " Value:" + pair.getValue());
              if (pair.getValue() == 1) { // if frequency is equal to 1
                  return pair.getKey();
              }
        }

        return 0;
    }

//    public static int nonRepeating(int[] arr, int n) {
//        for (int i = 0; i < n; i++) {
//            boolean isDuplicate = false;
//            for (int j = 0; j < n; j++) {
//                if (arr[i] == arr[j] && i != j) {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//
//            if (isDuplicate == false) {
//                return arr[i];
//            }
//        }
//
//        return 0;
//    }
}

// key value
//    -1  3
//    2   3
//    3   1
//    4   1

