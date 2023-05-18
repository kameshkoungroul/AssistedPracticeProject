package assistedPracticeProject;

public class MergeSortImp {

    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // Populate the left and right subarrays
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        // Recursively sort the left and right subarrays
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted subarrays
        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0; // Index for the left subarray
        int j = 0; // Index for the right subarray
        int k = 0; // Index for the merged array

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements from the left subarray
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

        // Copy the remaining elements from the right subarray
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 2, 1, 4};

        System.out.println("Array before sorting:");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("Array after sorting:");
        printArray(numbers);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
