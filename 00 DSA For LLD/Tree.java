// class Node {
//     int value;
//     Node left;
//     Node right;

//     Node(int value) {
//         this.value = value;
//         this.left = null;
//         this.right = null;
//     }
// }

// class BinaryTree {
//     Node root;

//     BinaryTree() {
//         this.root = null;
//     }

//     // Method to add a new value to the tree
//     public void add(int data) {
//         System.out.println("Adding: " + data);
//         root = addRecursive(root, data);
//     }

//     // Recursive method to insert a new value
//     protected Node addRecursive(Node root, int data) {
//         // Check if the current node is null
//         if (root == null) {
//             return new Node(data);
//         }

//         // Print the current node's value for debugging
//         System.out.println("Current node value: " + root.value);

//         if (data < root.value) {
//             root.left = addRecursive(root.left, data);
//         } else if (data > root.value) {
//             root.right = addRecursive(root.right, data);
//         }

//         return root; // Return the unchanged node pointer
//     }

    
//     public void inOrderTraversal() {
//         inOrderTraversalRecursive(root);
//         System.out.println();
//     }

//     private void inOrderTraversalRecursive(Node node) {
//         if (node != null) {
//             inOrderTraversalRecursive(node.left);
//             System.out.print(node.value + " ");
//             inOrderTraversalRecursive(node.right);
//         }
//     }
// }

// public class Tree {

//     public static void main(String[] args) {
//         BinaryTree bt = new BinaryTree();

//         // Adding values to the binary tree
//         bt.add(5);
//         bt.add(3);
//         bt.add(7);
//         bt.add(2);
//         bt.add(4);
//         bt.add(6);
//         bt.add(8);

//         // Print the binary tree in-order
//         System.out.print("In-order traversal: ");
//         bt.inOrderTraversal(); // Output should be: 2 3 4 5 6 7 8
//     }
// }











// Tree Traversal Techniques and Their Use Cases Tree


// traversal techniques are essential for accessing and processing nodes in a tree data
// structure.orithms, and when to


// use each one.1. Depth-First Search (DFS)



// A. Inorder Traversal
// Order: Left -> Root -> Right
// Description: Visits the left subtree first, then the root node, and finally the right subtree.
// Use Cases:
// Retrieving sorted data from binary search trees (BSTs).
// Evaluating expressions represented in binary trees.
// Example Diagram:
// text
//         A
//        / \
//       B   C
//      / \   \
//     D   E   F

// Inorder Traversal Output: D, B, E, A, C, F



// B. Preorder Traversal
// Order: Root -> Left -> Right
// Description: Visits the root node first, followed by the left subtree and then the right subtree.
// Use Cases:
// Creating a copy of the tree structure.
// Generating prefix expressions for expression trees.
// Example Diagram:
// text
//         A
//        / \
//       B   C
//      / \   \
//     D   E   F

// Preorder Traversal Output: A, B, D, E, C, F



// C. Postorder Traversal
// Order: Left -> Right -> Root
// Description: Visits the left subtree first, then the right subtree, and finally the root node.
// Use Cases:
// Deleting trees or freeing memory.
// Evaluating postfix expressions.
// Example Diagram:
// text
//         A
//        / \
//       B   C
//      / \   \
//     D   E   F

// Postorder Traversal Output: D, E, B, F, C, A



// 2. Breadth-First Search (BFS) or Level Order Traversal
// BFS explores all nodes at the present depth level before moving on to nodes at the next depth level. It uses a queue to keep track of nodes to visit.
// Order: Level by Level
// Description: Visits nodes level by level from left to right.
// Use Cases:
// Finding the shortest path in unweighted graphs or trees.
// Useful for applications requiring level-wise processing, such as printing tree structures or finding all nodes at a certain depth.
// Example Diagram:
// text
//         A
//        / \
//       B   C
//      / \   \
//     D   E   F

// Level Order Traversal Output: A, B, C, D, E, F
// Summary of Tree Traversal Techniques
// Traversal Type	Order	Description	Use Cases
// Inorder	Left -> Root -> Right	Visits nodes in non-decreasing order (BST)	Retrieving sorted data
// Preorder	Root -> Left -> Right	Visits root before subtrees	Copying trees, prefix expressions
// Postorder	Left -> Right -> Root	Visits root after subtrees	Deleting trees, postfix evaluations
// Level Order	Level by Level	Visits nodes level by level	Shortest path finding, serialization