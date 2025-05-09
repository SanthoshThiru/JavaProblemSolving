package ADT;

import java.util.Scanner;
import java.util.Arrays;

public class StaticDynamicArr {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size: ");
        int size = scanner.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("The Original Array:");
        System.out.println(Arrays.toString(arr));

        // Simulate dynamic array behavior
        int element = 103;
        int index = 3;

        System.out.println("The Array after add():");
        arr = add(arr, element); // 'size' not required
        System.out.println(Arrays.toString(arr));
        System.out.println("Length after add: " + arr.length);

        System.out.println("The Array after remove():");
        arr = remove(arr); // 'size' is derived from arr.length
        System.out.println(Arrays.toString(arr));

        if (index >= 0 && index < arr.length) {
            System.out.printf("The element at index %d is %d%n", index, get(arr, index));
        } else {
            System.out.println("Index out of bounds.");
        }

        System.out.printf("The size of the given array is %d%n", getSize(arr));

        scanner.close();
    }

    private static int getSize(int[] arr) {
        return arr.length;
    }

    private static int get(int[] arr, int index) {
        return arr[index];
    }

    private static int[] add(int[] arr, int element) {
        int[] myArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            myArr[i] = arr[i];
        }
        myArr[arr.length] = element;
        return myArr;
    }

    private static int[] remove(int[] arr) {
        if (arr.length == 0) return arr;
        int[] myArr = new int[arr.length - 1];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = arr[i];
        }
        return myArr;
    }
}
