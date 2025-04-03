package BinaryHeap.InsertNodeInBinaryHeap;

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


    // Heapify for Insert
    public void heapifyBottomToTop(int index, String heapType)
    {
        int parent = index / 2;         // O(1)
        if (index <= 1)                 // O(1)
        {
            return;
        }
        if (heapType == "Min")         // O(1)
        {
            if(arr[index] < arr[parent])  
            {
                int tmp = arr[index];           // O(1)
                arr[index] = arr[parent];
                arr[parent] = tmp;
            }
        }else if (heapType == "Max")
        {
            if(arr[index] > arr[parent])
            {
                int tmp = arr[index];           
                arr[index] = arr[parent];       // O(1)
                arr[parent] = tmp;
            }
        }

        heapifyBottomToTop(parent, heapType);       // O(LogN)
    }

    public void insert(int value, String heapType)
    {
        arr[sizeOfTree + 1] = value;        // O(1)
        sizeOfTree++;                       // O(1)
        heapifyBottomToTop(sizeOfTree, heapType);   // O(LogN)
        System.out.println("Inserted " + value + " successfully in Heap");  // O(1)
    }
    
}
