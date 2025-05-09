package ADT;
import java.util.Arrays;

public class MergeSortedArr {
    public static void main(String[] args) {
        int arr1[] = { 1, 4, 9, 13, 42 };
        int arr2[] = { 3, 5, 7, 24, 63 };

        int res[] = merge(arr1, arr2);
        System.out.println(Arrays.toString(res));
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }
}
