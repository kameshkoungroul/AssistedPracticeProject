package assistedPracticeProject;

public class ExpoSearchImp {

    public static int exponentialSearch(int[] array, int key) {
        int bound = 1;
        int length = array.length;

        // Find the range for binary search
        while (bound < length && array[bound] <= key) {
            bound *= 2;
        }

        // Perform binary search within the identified range
        int left = bound / 2;
        int right = Math.min(bound, length - 1);
        return binarySearch(array, key, left, right);
    }

    public static int binarySearch(int[] array, int key, int left, int right) {
        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] == key) {
                return mid; // Return the index if the key is found
            } else if (array[mid] < key) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Return -1 if the key is not found
    }

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15};
        int searchKey = 13;

        int index = exponentialSearch(numbers, searchKey);

        if (index != -1) {
            System.out.println("Key found at index " + index);
        } else {
            System.out.println("Key not found");
        }
    }
}
