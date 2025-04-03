package AVLTree.InsertANodeInAVLMethodInPractice;

import java.util.LinkedList;
import java.util.Queue;


public class AVL {
    BinaryNode root;
    
    // Constructor
    AVL() {
        root = null;
    }

    // PreOrder Traversal
    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // Inorder Traversal
    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.value + " ");
        inOrder(node.right);
    }

    // Post Order Traversal

    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + " ");
    }

    // Level Order Traversal

    void levelOrder() {
        Queue <BinaryNode> queue = new LinkedList <BinaryNode> ();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.println(presentNode.value + " ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }
    }

    // Search Method

    BinaryNode search (BinaryNode node, int value) {
        if (node == null) {
            System.out.println("value: " + value + " not found in BST");
            return null;
        } else if (node.value == value) {
            System.out.println("value: " + value + " found in BST");
            return node;
        } else if (value > node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

    // getHeight 

    public int getHeight(BinaryNode node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    // rotateRight

    private BinaryNode rotateRight (BinaryNode disbalancedNode) {
        BinaryNode newRoot = disbalancedNode.left;
        disbalancedNode.left = disbalancedNode.left.right;
        newRoot.right = disbalancedNode;
        disbalancedNode.height = 1 + Math.max (getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    // rotateLeft
    private BinaryNode rotateLeft (BinaryNode disbalancedNode) {
        BinaryNode newRoot = disbalancedNode.right;
        disbalancedNode.right = disbalancedNode.right.left;
        newRoot.left = disbalancedNode;
        disbalancedNode.height = 1 + Math.max (getHeight(disbalancedNode.left), getHeight(disbalancedNode.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));
        return newRoot;
    }

    //  getBalance 
    public int getBalance (BinaryNode node) {
        if (node == null) {
            return 0;
        }
        return getHeight(node.left) - getHeight(node.right);
    }

    // InsertNode Method
    private BinaryNode insertNode(BinaryNode node, int nodeValue) {
        if (node == null) {                                 // O(1)
            BinaryNode newNode = new BinaryNode();  
            newNode.value = nodeValue;
            newNode.height = 1;
            return newNode;                                 // O(1)
        } else if (nodeValue < node.value) {
            node.left = insertNode(node.left, nodeValue);   // O(Logn)
        } else {
            node.right = insertNode(node.right, nodeValue); // O(Logn)
        }

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));    // O(1)
        int balance = getBalance(node);             // O(1)

        if (balance > 1 && nodeValue < node.left.value) {
            return rotateRight(node);               // O(1)
        }

        if (balance > 1 && nodeValue > node.left.value) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);               // O(1)
        }

        if (balance < -1 && nodeValue > node.right.value) {
            return rotateLeft(node);                // O(1)
        }

        if (balance < -1 && nodeValue < node.right.value) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);                // O(1)
        }

        return node;

        // Time Complexity : O(Logn)
        // Space Complexity : O(Logn)
    }

    // Insert method

    public void insert(int value) {
        root = insertNode(root, value);
    }

}
