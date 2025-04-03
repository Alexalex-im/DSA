package Tree.BinaryTreeUsingLinkedList.PreOrderTraversalInBinaryTreeUsingLinkedList;

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
}