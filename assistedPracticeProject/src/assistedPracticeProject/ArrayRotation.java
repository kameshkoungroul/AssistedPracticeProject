package assistedPracticeProject;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int steps = 5;

        System.out.println("Original Array: " + Arrays.toString(arr));

        rightRotate(arr, steps);

        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }

    public static void rightRotate(int[] arr, int steps) {
        int length = arr.length;
        steps = steps % length;

        reverseArray(arr, 0, length - 1);
        reverseArray(arr, 0, steps - 1);
        reverseArray(arr, steps, length - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
