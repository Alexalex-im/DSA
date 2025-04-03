package Tree.BinaryTreeUsingLinkedList.PostOrderTraversalInBinaryTreeUsingLinkedList;

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

}