//              Insertion - Binary Tree

//          - A root node is null
//          - The tree exists and we have to look for a first vacant place

//      Level Order Traversal
//      newNode


package Tree.BinaryTreeUsingLinkedList.InsertionMethodInBinaryTreeLinkedList;

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


    }
}
