PROBLEM LINK- https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays

//Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> union = new ArrayList<>();
        
        int i = 0, j = 0, temp = Integer.MIN_VALUE;
        
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                if (arr1[i] != temp) {
                    union.add(arr1[i]);
                    temp = arr1[i];
                }
                i++;
            } else {
                if (arr2[j] != temp) {
                    union.add(arr2[j]);
                    temp = arr2[j];
                }
                j++;
            }
        }
        
        while (i < n) {
            if (arr1[i] != temp) {
                union.add(arr1[i]);
                temp = arr1[i];
            }
            i++;
        }
        
        while (j < m) {
            if (arr2[j] != temp) {
                union.add(arr2[j]);
                temp = arr2[j];
            }
            j++;
        }
        return union;
    }
