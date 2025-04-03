//     Binary Search Tree - Delete a Node

//      case 1: The node to be deleted is a leaf node
//      case 2: The node has one child
//      case 3: The node has two children

//      case 1: The node to be deleted is a leaf node
//      

package BinarySearchTree.DeleteANodeInBinarySearchTree;

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

        // newBST.levelOrder();
        // newBST.search(newBST.root, 40);
        // newBST.search(newBST.root, 45);

        newBST.levelOrder();
        System.out.println();
        newBST.deleteNode(newBST.root, 90);
        newBST.levelOrder();

    }
}