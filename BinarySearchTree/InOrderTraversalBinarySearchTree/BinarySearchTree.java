package BinarySearchTree.InOrderTraversalBinarySearchTree;


public class BinarySearchTree {
    BinaryNode root;

    BinarySearchTree() {
        root = null;        // O(1)

        // Time Complexity : O(1)
        // Space Complexity : O(1)
        
    }

    // Insert Method 

    private BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {                      // O(1)
            BinaryNode newNode = new BinaryNode();      // O(1)
            newNode.value = value;                      // O(1)
            // System.out.println(" The value successfully inserted"); // O(1)
            return newNode;                             // O(1)
        } else if (value <= currentNode.value) {        // O(1)
            currentNode.left = insert(currentNode.left, value);     // O(N/2)
            return currentNode;                         // O(1)
        } else {
            currentNode.right = insert(currentNode.right, value);   // O(N/2)     
            return currentNode;     // O(1)
        }

        // Time Complexity : O(logn)
        // space Complexity : O(logn)
    } 

    void insert(int value) {
        root = insert(root, value);
    }

    // preOrder Traversal

    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);

        // Time Complexity : O(n)
        // Space Complexity : O(n)
    }

    // InOrder Traversal

    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);

        // Time Complexity : O(n)
        // Space Complexity : O(n)
    }
}
