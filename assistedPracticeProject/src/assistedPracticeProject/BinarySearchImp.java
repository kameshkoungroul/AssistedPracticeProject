package assistedPracticeProject;

public class BinarySearchImp {

    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == key) {
                return mid; // Return the index if the key is found
            } else if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Return -1 if the key is not found
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int searchKey = 6;

        int index = binarySearch(numbers, searchKey);

        if (index != -1) {
            System.out.println("Key found at index " + index);
        } else {
            System.out.println("Key not found");
        }
    }
}
