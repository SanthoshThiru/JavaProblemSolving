package ADT;

import java.util.Arrays;

public class Insertion_Sorted {
    public static void main(String[] args) {
        int[] sorted_arr = {3, 5, 7, 24, 63};
        int element = 53;
        int[] res = insert_sorted(sorted_arr, element);
        System.out.println(Arrays.toString(res));
    }

    private static int[] insert_sorted(int[] arr, int element) {
        int l = 0;
        int r = arr.length - 1;
        int pos = arr.length;  

        while (l <= r) {
            int m = (l + r) / 2;
            if (element < arr[m]) {
                pos = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return insert(arr, pos, element);
    }

    private static int[] insert(int[] arr, int pos, int element) {
        int[] myarr = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            myarr[i] = arr[i];
        }
        myarr[pos] = element;
        for (int i = pos + 1; i < myarr.length; i++) {
            myarr[i] = arr[i - 1];
        }
        return myarr;
    }
}
