package assistedPracticeProject;

import java.util.LinkedList;
import java.util.Queue;

public class impQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        
        int removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after removal: " + queue);

    }
}
