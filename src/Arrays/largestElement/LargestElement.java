package Arrays.largestElement;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 7, 56, 90 };
        int ans = largestElement(arr);
        System.out.println(ans);
    }

    public static int largestElement(int[] arr) {
        int largest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

//    public static int largestElement(int[] arr) {
//         // code here
//         int largest = -1;
//         for (int i = 0; i < arr.length; i++) {
//             largest = arr[i]; // 8
//             boolean isLargest = true;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[i] < arr[j]) {
//                     isLargest = false;
//                     break;
//                 }
//             }
//
//             if (isLargest == true) {
//                 break;
//             }
//         }
//
//         return largest;
//    }
}
