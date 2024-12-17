
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


public class LinkedList {

    Node head;
    
    LinkedList() {
        this.head = null;
    }

    public void add(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node findLastNode = head;
            while (findLastNode.next != null) {
                findLastNode = findLastNode.next;
            }
            findLastNode.next = newNode;
        }
    }
    
    public void delete(int data) {
        if (head == null)
            return; 
        if (head.data == data) {
            head = head.next; 
            return;
        }
        Node current = head;
        Node previous = null;
        while (current != null && current.data != data) {
            previous = current;
            current = current.next; 
        }
        if (current == null)
            return;
        previous.next = current.next;
    }
    

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }




    public static void main(String[] args) {
       LinkedList linkedList = new LinkedList();
        
        // Adding elements to the linked list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        // Printing the linked list
        System.out.print("Linked List: ");
        linkedList.printList();
        linkedList.delete(2);
        System.out.print("Linked List: ");
        linkedList.printList();


    }

    
}