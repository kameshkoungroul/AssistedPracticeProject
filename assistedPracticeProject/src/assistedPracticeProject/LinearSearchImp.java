package assistedPracticeProject;

public class LinearSearchImp {

    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i; // Return the index if the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }

    public static void main(String[] args) {
        int[] numbers = {4, 2, 9, 7, 5, 1, 8, 3, 6};
        int searchKey = 5;

        int index = linearSearch(numbers, searchKey);

        if (index != -1) {
            System.out.println("Key found at index " + index);
        } else {
            System.out.println("Key not found");
        }
    }
}
