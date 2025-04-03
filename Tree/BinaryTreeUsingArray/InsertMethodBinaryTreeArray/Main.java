//          Binary Tree (Array) - Insert a Node


//      - The Binary Tree is full
//      - We have to look for a first vacant place 

//      LastUsedIndex = 9
//      newNode
//      Index = 10
//      Left child = celll[2x]
//      indexOfParent = 10/2 = 5


package Tree.BinaryTreeUsingArray.InsertMethodBinaryTreeArray;

public class Main {
    public static void main(String[] args) {
        BinaryTree newBinaryTree = new BinaryTree(5);
        newBinaryTree.insert("N1");
        newBinaryTree.insert("N2");
        newBinaryTree.insert("N3");
        newBinaryTree.insert("N4");
        newBinaryTree.insert("N5");
        newBinaryTree.insert("N6");

    }
}
