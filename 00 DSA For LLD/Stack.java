
//                          // *** Implement a stack using Arrays ***//

// // public class Stack {

// //   static final int MAX = 1000;
// //   int top;
// //   int a[] = new int[MAX];

// //   boolean isEmpty() {
// //     return (top < 0);
// //   }

// //   Stack() {
// //     top = -1;
// //   }

// //   boolean push(int x) {
// //     if (top >= (MAX - 1)) {
// //       System.out.println("Stack Overflow");
// //       return false;
// //     } else {
// //       a[++top] = x;
// //       System.out.println(x + " pushed into stack");
// //       return true;
// //     }
// //   }
  
// //   boolean pop() {
// //     if(top<0)
// //     {
// //       System.out.println("Stack Underflow");
// //       return false;
// //     }
// //     else {
// //       int x = a[top--];
// //       System.out.println(x + " pop from Stack");
// //       return true;

// //     }
// //   }





// //   public static void main(String[] args) {
// //     Stack s = new Stack();
// //     s.push(10);
// //     s.push(20);
// //     s.push(30);
// //     s.pop();    
// //   }
  
  
// // }







//                        //*** Implement a stack using singly linked list ***//

// class Node {
//   int data;
//   Node next;

//   Node(int new_data) {
//     this.data = new_data;
//     this.next = null;
//   }
// }

// public class Stack {

//   private Node top; 
//   public Stack() {
//     this.top = null;
//   }

//   void push(int data) {
//     Node newNode = new Node(data);
//     newNode.next = top;
//     top = newNode;
//     System.out.println(data + " pushed onto stack.");
//   }
  

//   public void pop() {
//     if (top == null) {
//       System.out.println("Stack is empty. Cannot pop.");
//       return;
//     }
//     int poppedData = top.data; 
//     top = top.next; 
//     System.out.println(poppedData + " pop from stack.");
//   }

  
//   public static void main(String[] args) {
//     Stack stack = new Stack();
//     stack.push(10);
//     stack.push(20);
//     stack.push(30);
//     stack.pop();
//     stack.pop();
//     stack.pop();
//     stack.pop();

//   }
// }