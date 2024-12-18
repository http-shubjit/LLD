//aka Circular SinglyLinkedList

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class CircularSinglyLinkedList {
    private Node head;

    public CircularSinglyLinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            head.next = head;
        } else {
            Node tail = head;
            while (tail.next != head) { 
                tail = tail.next;
            }
            newNode.next = head; 
            tail.next = newNode; 
            head = newNode; 
        }
    }

    
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            head.next = head; 
        } else {
            Node tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            tail.next = newNode; 
            newNode.next = head; 
        }
    }

   

    public void delete(int key) {
        if (isEmpty())
            return;

        Node current = head, prev = null;

        // If the node to be deleted is the only node in the list
        if (current.data == key && current.next == head) {
            head = null; // List becomes empty
            return;
        }

        // If the node to be deleted is the head node
        if (current.data == key) {
            while (current.next != head) { // Find last node
                current = current.next;
            }
            current.next = head.next; // Bypass the old head
            head = head.next; // Update head to next node
            return;
        }

        // Search for the node to be deleted, keeping track of the previous node
        while (current.next != head && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If the key was not found in the list
        if (current.data != key) {
            System.out.println("Node with data " + key + " not found.");
            return;
        }
        prev.next = current.next; 
    }

    // Method to display the list contents using a while loop
    public void display() {
        if (isEmpty()) {
            System.out.println("Circular Singly Linked List is empty.");
            return;
        }

        Node current = head;
        System.out.print(current.data + " -> "); // Print the head node

        current = current.next; // Move to the next node

        while (current != head) { // Continue until we reach the head again
            System.out.print(current.data + " -> ");
            current = current.next; // Move to the next node
        }

        System.out.println("(head)");
    }
    
    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();

        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);

        System.out.println("After inserting elements:");
        list.display();

        list.insertAtBeginning(0);

        System.out.println("After inserting at beginning:");
        list.display();

        list.delete(2);

        System.out.println("After deleting element 2:");
        list.display();

        list.delete(0);

        System.out.println("After deleting element 0:");
        list.display();

        list.delete(5); // Attempting to delete a non-existent element.
    }
}
