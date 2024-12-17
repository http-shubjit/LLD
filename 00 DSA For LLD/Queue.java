public class Queue {
    
    int front, rear, capacity;
    int[] queue;

    Queue(int c) {
        front = 0;
        rear = -1;
        capacity = c;
        queue = new int[capacity];
    }

    
    void enqueue(int data) {

        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }
        queue[++rear] = data;
    }

    void dequeue() {

        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = 0; i < rear; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;

    }
    
    void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " <-- ");
        }
        System.out.println();
    }
    
    
public static void main(String[] args) {
    Queue q = new Queue(5);
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.enqueue(50);
   
    q.display();

    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();
    
    q.display();
    

}


}
