// Implement a Queue using Arrays

// public class Queue {

//     int front, rear, capacity;
//     int[] queue;

//     Queue(int c) {
//         front = 0;
//         rear = -1;
//         capacity = c;
//         queue = new int[capacity];
//     }

//     void enqueue(int data) {

//         if (rear == capacity - 1) {
//             System.out.println("Queue is full");
//             return;
//         }
//         queue[++rear] = data;
//     }

//     void dequeue() {

//         if (front > rear) {
//             System.out.println("Queue is Empty");
//             return;
//         }

//         for (int i = 0; i < rear; i++) {
//             queue[i] = queue[i + 1];
//         }
//         rear--;

//     }

//     void display() {
//         if (front > rear) {
//             System.out.println("Queue is Empty");
//             return;
//         }
//         for (int i = front; i <= rear; i++) {
//             System.out.print(queue[i] + " <-- ");
//         }
//         System.out.println();
//     }

// public static void main(String[] args) {
//     Queue q = new Queue(5);
//     q.enqueue(10);
//     q.enqueue(20);
//     q.enqueue(30);
//     q.enqueue(40);
//     q.enqueue(50);

//     q.display();

//     q.dequeue();
//     q.dequeue();
//     q.dequeue();
//     q.dequeue();
//     q.dequeue();

//     q.display();

// }

// }

// Implement a Queue using singly linked list

// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;   
//     }
// }


// public class Queue {

//     private Node front; 
//     private Node rear;

//     public Queue() {
//         this.front = null;
//         this.rear = null;
//     }
    
//     public void enqueue(int data) {
//         Node newNode = new Node(data); 
//         if (front == null) {
//             front = newNode; 
//             rear = newNode;
//         } else {
//             rear.next = newNode; 
//             rear = newNode; 
//         }
//         System.out.println(data + " enqueued to queue.");
//     }

//     // Method to remove and return an element from the front of the queue (dequeue)
//     public void dequeue() {
//         if (front==null) {
//             System.out.println("Queue is empty. Cannot dequeue.");
//             return ; 
//         }
//         int dequeuedData = front.data; 
//         front = front.next; 

//         if (front == null) { 
//             rear = null;
//         }
//         System.out.println(dequeuedData + " dequeued from queue.");
        
//     }

//     public static void main(String[] args) {
//         Queue queue = new Queue();

//         queue.enqueue(10);
//         queue.enqueue(20);
//         queue.enqueue(30);
//     }
// }