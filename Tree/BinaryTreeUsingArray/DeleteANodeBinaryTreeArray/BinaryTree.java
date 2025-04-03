package Tree.BinaryTreeUsingArray.DeleteANodeBinaryTreeArray;

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

    // preOrder Traversal
    public void preOrder(int index) {
        if (index > lastUsedIndex) {    // O(1)
            return;                 // O(1)
        }
        System.out.print(arr[index] + " ");   // O(1)
        preOrder(index * 2);        // O(N/2)
        preOrder(index * 2 + 1);    // O(N/2)

        // Time Complexity : O(n)
        // Space Complexity : O(n)
    }

    // Inorder traversal

    public void inOrder(int index) {
        if (index > lastUsedIndex) {        // O(1)
            return;         // O(1)
        }
        inOrder(index * 2);     // O(N/2)
        System.out.print(arr[index] + " "); // O(1)
        inOrder(index * 2 + 1);     // O(N/2)

        // Time complexity : O(n)
        // Space Complexity : O(n)
    }

    // Post Order traversal 

    public void postOrder(int index) {
        if (index > lastUsedIndex) {        // O(1)
            return;                         // O(1)
        }
        postOrder(2 * index);       // O(N/2)
        postOrder(2 * index + 1);   // O(N/2)
        System.out.print(arr[index] + " ");  // O(1)

        // Time Complexity : O(n)
        // Space Complexity : O(n)
    }

    // LevelOrder Traversal

    public void levelOrder() {
        for (int i=1; i<=lastUsedIndex; i++) {  // O(n)
            System.out.print(arr[i] + " ");     // O(1)
        }

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }

    // Search method

    public int search(String value) {
        for (int i=1; i<=lastUsedIndex; i++) {  // O(n)
            if (arr[i] == value) {      // O(1)
                System.out.println(value + " exist at the location: " + i); // O(1)
                return i;       // O(1)
            }
        }
        System.out.println(" The value does not exist in BI");  // O(1)
        return -1;  // O(1)

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }

    // Delete Method
    public void delete(String value) {
        int location = search(value);       // O(n)
        if (location == -1) {               // O(1)
            return;                 // O(1)
        } else {
            arr[location] = arr[lastUsedIndex]; // O(1)
            lastUsedIndex--;        // O(1)
            System.out.println(" The node successfully deleted "); // O(1)
        }

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }
}
