package assistedPracticeProject;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteFirstOccurrence(int key) {
        if (head == null) {
            System.out.println("List is empty. Deletion not possible.");
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Key not found in the list.");
            return;
        }

        previous.next = current.next;
    }
}

public class ImpDeletion {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("List:");
        list.display();

        int key = 30;
        list.deleteFirstOccurrence(key);

        System.out.println("List after deleting first occurrence of " + key + ":");
        list.display();
    }
}