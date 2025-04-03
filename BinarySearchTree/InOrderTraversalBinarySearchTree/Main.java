//     Binary Search Tree - Traversal

//      Depth first Search
//          - Preorder traversal
//          - Inorder traversal
//          - Post order traversal
//      Breadth first Search
//          - Level order traversal

//  InOrder Traversal

//      Left Subtree
//      Root Node
//      Right Subtree

package BinarySearchTree.InOrderTraversalBinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree newBST = new BinarySearchTree();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);

        // newBST.preOrder(newBST.root);
        newBST.inOrder(newBST.root);

    }
}