class Node {
    Node prev;
    int data;
    Node next;

    Node(int data) {
        this.prev = null;
        this.data = data;
        this.next = null;
    }
    }

    class DoublyLinkedList {
        private Node head;

        public DoublyLinkedList() {
            this.head = null;
        }

        
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.prev = temp;
        }

        // Insert a new node at the beginning of the list
        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        // Delete a node by value
        public void deleteByValue(int data) {
            if (head == null)
                return;

            Node temp = head;

            
            if (temp.data == data) {
                head = temp.next; 
                if (head != null) {
                    head.prev = null; 
                }
                return;
            }

            while (temp != null && temp.data != data) {
                temp = temp.next;
            }

           
            if (temp == null)
                return;

            if (temp.next != null) {
                temp.next.prev = temp.prev; 
            }

            if (temp.prev != null) {
                temp.prev.next = temp.next; 
            }
        }

        
        public void displayForward() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Display the list in reverse direction
        public void displayBackward() {
            Node temp = head;

            // Go to the last node
            while (temp != null && temp.next != null) {
                temp = temp.next;
            }

            // Traverse backward
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            DoublyLinkedList dll = new DoublyLinkedList();

            dll.insertAtEnd(10);
            dll.insertAtEnd(20);
            dll.insertAtEnd(30);

            System.out.print("List after inserting at end: ");
            dll.displayForward(); // Output: 10 20 30

            dll.insertAtBeginning(5);

            System.out.print("List after inserting at beginning: ");
            dll.displayForward(); // Output: 5 10 20 30

            dll.deleteByValue(20);

            System.out.print("List after deleting 20: ");
            dll.displayForward(); // Output: 5 10 30

            System.out.print("List in reverse order: ");
            dll.displayBackward(); // Output: 30 10 5
        }
    }
