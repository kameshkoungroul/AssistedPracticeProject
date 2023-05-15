package assistedPracticeProject;

import java.util.Arrays;

public class FourthSmallestElement {
    public static void main(String[] args) {
        int[] nums = {9, 5, 2, 7, 1, 8, 3, 6, 4};

        int fourthSmallest = findFourthSmallest(nums);

        System.out.println("The fourth smallest element is: " + fourthSmallest);
    }

    public static int findFourthSmallest(int[] nums) {
        if (nums.length < 4) {
            System.out.println("The list doesn't have enough elements.");
            return -1;
        }

        Arrays.sort(nums);

        return nums[3];
    }
}
