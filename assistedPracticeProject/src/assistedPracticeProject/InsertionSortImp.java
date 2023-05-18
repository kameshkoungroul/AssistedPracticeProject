package assistedPracticeProject;

public class InsertionSortImp {

    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Shift elements greater than the key to the right
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            // Place the key at its correct position
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 2, 1, 4};

        System.out.println("Array before sorting:");
        printArray(numbers);

        insertionSort(numbers);

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
