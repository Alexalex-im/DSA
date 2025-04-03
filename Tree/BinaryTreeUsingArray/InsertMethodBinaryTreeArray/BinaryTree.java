package Tree.BinaryTreeUsingArray.InsertMethodBinaryTreeArray;

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

    // isFull
    boolean isFull() {
        if (arr.length-1 == lastUsedIndex) {
            return true;
        } else {
            return false;
        }
    }

    // insert method

    void insert (String value) {
        if (!isFull()) {        // O(1)
            arr[lastUsedIndex+1] = value;   // O(1)
            lastUsedIndex++;        // O(1)
            System.out.println(" The value of " +value+ " has been inserted");              // O(1)
        } else {
            System.out.println("The BT is full");   // O(1)
        }

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }
}
