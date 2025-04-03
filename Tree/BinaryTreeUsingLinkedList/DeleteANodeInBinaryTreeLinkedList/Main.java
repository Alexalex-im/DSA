//              Deletion - Binary Tree         

//      Level Order Traversal
//      N3
//      Step 1 - Find the Node
//      Step 2 - Find Deepest Node 
//      Step 3 - Set Deepest Node's value to Current Node
//      Step 4 - Delete Deepest Node


package Tree.BinaryTreeUsingLinkedList.DeleteANodeInBinaryTreeLinkedList;

public class Main {
    public static void main(String[] args) {
        BinaryTreeLL binaryTree = new BinaryTreeLL();
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        binaryTree.levelOrder();
        // System.out.println(binaryTree.getDeepestNode().value);
        // binaryTree.deleteDeepestNode();
        binaryTree.deleteNode("N3");
        System.out.println();
        binaryTree.levelOrder();

    }
}
