package AVLTree.InsertANodeInAVLALLTogether;


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
}
