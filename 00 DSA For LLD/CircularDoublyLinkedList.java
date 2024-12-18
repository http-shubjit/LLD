class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class CircularDoublyLinkedList {
    private Node head;

    // Constructor
    public CircularDoublyLinkedList() {
        this.head = null;
    }

    // Method to check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Method to insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            head.next = head; // Pointing to itself
            head.prev = head; // Pointing to itself
        } else {
            Node tail = head.prev; // Get the last node
            tail.next = newNode; // Link last node to new node
            newNode.prev = tail; // Link new node back to last node
            newNode.next = head; // New node points to head
            head.prev = newNode; // Head's previous points to new node
        }
    }

    // Method to display the list contents
    public void display() {
        if (isEmpty()) {
            System.out.println("Circular Doubly Linked List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != head);

        System.out.println("(head)");
    }

    // Method to delete a node by value
    public void delete(int key) {
        if (isEmpty())
            return;

        Node current = head;

        // If the list contains only one node and it matches the key
        if (current.data == key && current.next == head) {
            head = null; // List becomes empty
            return;
        }

        // If the node to be deleted is the head node
        if (current.data == key) {
            Node tail = head.prev; // Get the last node
            tail.next = current.next; // Bypass old head
            current.next.prev = tail; // Update previous of next node
            head = current.next; // Update head to next node
            return;
        }

        // Search for the node to be deleted, keeping track of previous node
        while (current.next != head && current.data != key) {
            current = current.next;
        }

        // If the key was not found in the list
        if (current.data != key) {
            System.out.println("Node with data " + key + " not found.");
            return;
        }

        // Bypass the node to be deleted
        current.prev.next = current.next;
        current.next.prev = current.prev;
    }
    public static void main(String[] args) {
        
    
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println("After inserting elements:");
        list.display();

        list.delete(20);

        System.out.println("After deleting element 20:");
        list.display();

        list.delete(10); // Deleting first element.

        System.out.println("After deleting element 10:");
        list.display();

        list.delete(30);
        System.out.println("After deleting element 30:");
        list.display(); // Should show that the list is empty.

        list.delete(40);
    }
}
