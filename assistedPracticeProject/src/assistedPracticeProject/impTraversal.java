package assistedPracticeProject;

public class impTraversal {
    private Node head;

    private static class Node {
        private int data;
        private Node prev;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    public void printForward() {
        System.out.print("Doubly linked list (forward): ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void printBackward() {
        System.out.print("Doubly linked list (backward): ");
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        impTraversal list = new impTraversal();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.printForward();
        list.printBackward();
    }
}

