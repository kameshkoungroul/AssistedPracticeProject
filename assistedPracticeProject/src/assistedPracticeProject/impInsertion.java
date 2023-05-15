package assistedPracticeProject;

class Node1 {
    int data;
    Node1 next;

    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node1 head;

    public void insert(int data) {
        Node1 newNode = new Node1(data);

        if (head == null) {
            newNode.next = newNode;
            head = newNode;
        } else if (data <= head.data) {
            Node1 current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
            head = newNode;
        } else {
            Node1 current = head;
            while (current.next != head && current.next.data < data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node1 current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class impInsertion {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Circular Linked List:");
        list.display();

        int elementToInsert = 25;
        list.insert(elementToInsert);

        System.out.println("Circular Linked List after inserting " + elementToInsert + ":");
        list.display();
    }
}
