package Tree.BinaryTreeUsingArray.CreateBinaryTreeArray;

public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) {
        arr = new String[size+1];       // O(1)
        this.lastUsedIndex = 0;         // O(1)
        System.out.println("Blank Tree of size " + size + " has been created");     // O(1)

        // Time Complexity : O(1)
        // Space Complexity : O(n)
    }
}
