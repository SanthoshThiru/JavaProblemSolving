package ADT;

import java.util.Arrays;

public class Union {
    public static void main(String[] args) {
        int arr1[] = { 1, 5, 9, 33, 56 };
        int arr2[] = { 9, 5, 16, 33, 12 };

        int[] res1 = myUnion(arr1, arr2);
        System.out.println("Union: " + Arrays.toString(res1));

        int[] res2 = myIntersect(arr1, arr2);
        System.out.println("Intersection: " + Arrays.toString(res2));
    }

    private static int[] myUnion(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        int index = 0;

        // Add all elements from arr1
        for (int i = 0; i < arr1.length; i++) {
            if (!contains(temp, index, arr1[i])) {
                temp[index++] = arr1[i];
            }
        }

        // Add all elements from arr2 if not already added
        for (int i = 0; i < arr2.length; i++) {
            if (!contains(temp, index, arr2[i])) {
                temp[index++] = arr2[i];
            }
        }

        return Arrays.copyOf(temp, index);
    }

    private static int[] myIntersect(int[] arr1, int[] arr2) {
        int[] temp = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !contains(temp, index, arr1[i])) {
                    temp[index++] = arr1[i];
                    break; // Found a match, no need to check further
                }
            }
        }

        return Arrays.copyOf(temp, index);
    }

    private static boolean contains(int[] arr, int length, int value) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == value)
                return true;
        }
        return false;
    }
}
