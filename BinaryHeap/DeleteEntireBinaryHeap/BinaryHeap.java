package BinaryHeap.DeleteEntireBinaryHeap;

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
    

    // heapifyTopToBottom
    public void heapifyTopToBottom(int index, String heapType)
    {
        int left = index*2;
        int right = index*2+1;
        int swapChild = 0;
        if (sizeOfTree < left) {
            return;
        }
        if(heapType == "Max")
        {
            if (sizeOfTree == left) {
                if (arr[index] < arr[left])
                {
                    int tmp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = tmp;
                }
                return;
            }else {
                if (arr[left] > arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] < arr[swapChild]) {
                    int tmp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = tmp;
                }
            }
        } else if (heapType == "Min") {
            if (sizeOfTree == left) {
                if (arr[index] > arr[left])
                {
                    int tmp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = tmp;
                }
                return;
            }else {
                if (arr[left] < arr[right]) {
                    swapChild = left;
                } else {
                    swapChild = right;
                }
                if (arr[index] > arr[swapChild]) {
                    int tmp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = tmp;
                }
            }
        }
        heapifyTopToBottom(swapChild, heapType);
    }

    public int extractHeadOfBH(String heapType) {
        if (isEmpty()) {
            return -1;                      // O(1)
        }else {
            int extractedValue = arr[1];    // O(1)
            arr[1] = arr[sizeOfTree];       // O(1)
            sizeOfTree--;                   // O(1)
            heapifyTopToBottom(1, heapType);    // O(LogN)
            return extractedValue;          // O(1)
        }
    }

    // Delete
    public void deleteBH()
    {
        arr = null;
        System.out.println("BH has successfully deleted");
    }
}
