package Tree.BinaryTreeUsingLinkedList.InsertionMethodInBinaryTreeLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
    BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;       // O(1)

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }

    // PreOrder traversal 
    void preOrder(BinaryNode node) {    // O(1)
        if (node == null) {             // O(1)
            return;                     // O(1)
        }
        System.out.print(node.value + " ");     // O(1)

        preOrder(node.left);        // O(N/2)
        preOrder(node.right);       // O(N/2)

        // Time Complexity : O(n)
        // Space Complexity : O(n)

    }

    // InOrder Traversal 

    void inOrder(BinaryNode node) {
        if (node == null) {            // O(1)
            return;                     // O(1)
        }
        inOrder(node.left);             // O(N/2)
        System.out.println(node.value + " ");   // O(1)
        inOrder(node.right);            // O(N/2)

        // Time Complexity : O(n)
        // Space Complexity : O(n)
    }

    // PostOrder Traversal 
    void postOrder(BinaryNode node) {
        if (node == null){              // O(1)
            return;                     // O(1)
        }
        postOrder(node.left);           // O(N/2)
        postOrder(node.right);          // O(N/2)
        System.out.println(node.value + " ");   // O(1)

        // Time Complexity : O(n)
        // Space Complexity : O(n)
    }

    // Level Order Traversal

    void levelOrder() {
        Queue <BinaryNode> queue = new LinkedList <BinaryNode> ();  // O(1)
        queue.add(root);                                            // O(1)
        while (!queue.isEmpty()) {                                  // O(n)
            BinaryNode presentNode = queue.remove();                // O(1)
            System.out.print(presentNode.value + " ");              // O(1)
            if (presentNode.left != null) {                         // O(1)
                queue.add(presentNode.left);                        // O(1)
            }

            if (presentNode.right != null) {                        // O(1)
                queue.add(presentNode.right);
            }
        }

        // Time Complexity : O(n)
        // Space Complexity : O(n)
    }

    // Search method 

    public void search(String value) {
        Queue <BinaryNode> queue = new LinkedList<BinaryNode> ();       // O(1)
        queue.add(root);                                                // O(1)
        while (!queue.isEmpty()) {                                      // O(n)
            BinaryNode presentNode = queue.remove();                    // O(1)
            if (presentNode.value == value) {                           // O(1)
                System.out.println("The value-" +value+ " is found in Tree");
                return;                                                 // O(1)
            } else {
                if (presentNode.left != null) {
                    queue.add(presentNode.left);
                }                                   // O(1)

                if (presentNode.right != null) {
                    queue.add(presentNode.right);
                }                                   // O(1)
            }
        }
        System.out.print("The value-" +value+ " is not found in Tree");     // O(1)

        // Time Complexity : O(n)
        // Space Complexity : O(n)
    }

    // Insert Method 
    void insert(String value) {
        BinaryNode newNode = new BinaryNode();
        newNode.value = value;      // O(1)
        if (root == null) {
            root = newNode;
            System.out.println("Inserted new node at Root");
            return;                 // O(1)
        }
        Queue <BinaryNode> queue = new LinkedList<BinaryNode> ();
        queue.add(root);            // O(1)
        while (!queue.isEmpty()) {          // O(n)
            BinaryNode presentNode = queue.remove();
            if (presentNode.left == null) {
                presentNode.left = newNode;
                System.out.println("Successfully inserted");
                break;                          // O(1)
            } else if (presentNode.right == null) {
                presentNode.right = newNode;
                System.out.println("Successfully Inserted");
                break;                          // O(1)
            } else {
                queue.add(presentNode.left);    // O(1)
                queue.add(presentNode.right);   // O(1)
            }
        }

        // Time Complexity : O(n)
        // Space Complexity : O(n)
    }


}