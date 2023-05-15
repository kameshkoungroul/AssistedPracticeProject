package assistedPracticeProject;

import java.util.Stack;

public class impStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

       
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        int removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Stack after removal: " + stack);

    }
}
