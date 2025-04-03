package BinaryHeap.CommonOperationOnBinaryHeap;

public class BinaryHeap {
    int arr[];
    int sizeOfTree;

    public BinaryHeap(int size) {
        arr = new int[size + 1];            // O(1)
        this.sizeOfTree = 0;                // O(1)
        System.out.println("Binary Heap has been created");  // O(1)
    }

    // Peek
    public boolean isEmpty() {      // O(1)
        if (sizeOfTree == 0)        
        {
            return true;
        } else {
            return false;
        }
    } 

    public Integer peek()
    {
        if(isEmpty()) {             // O(1)
            System.out.println("Binary heap is Empty");  // O(1)
            return null;            // O(1)
        }
        return arr[1];              // O(1)
    }


    // size of Binary Heap
    public int sizeOfBH() {
        return sizeOfTree;
    }

    // Level Order Traversal
    public void levelOrder() {
        for (int i=1; i<=sizeOfTree; i++) {     // O(n)
            System.out.println(arr[i] + " ");   // O(1)
        }
        System.out.println("/n");           // O(1)
    }
}
