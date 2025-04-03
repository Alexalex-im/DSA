//              Deletion Entire Binary Tree         

//      rootNode = Null



package Tree.BinaryTreeUsingLinkedList.DeleteEntireBianryTreeLinkedList;

public class Main {
    public static void main(String[] args) {
        BinaryTreeLL binaryTree = new BinaryTreeLL();
        binaryTree.insert("N1");
        binaryTree.insert("N2");
        binaryTree.insert("N3");
        binaryTree.insert("N4");
        binaryTree.insert("N5");
        binaryTree.insert("N6");
        // binaryTree.levelOrder();
        // System.out.println(binaryTree.getDeepestNode().value);
        // binaryTree.deleteDeepestNode();
        // binaryTree.deleteNode("N3");
        // System.out.println();
        // binaryTree.levelOrder();
        binaryTree.deleteBT();

    }
}
