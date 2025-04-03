//  Heap Sort
//    Step 1 : Insert data to Binary Heap Tree
//    Step 2 : Extract data from Binary heap 

//    - It is best suited with array, it does not work with Linked List

//    Binary Heap is a binary tree with special properties
//          - The value of any given node must be less or equal of its children (min heap)
//          - The value of any given node must be greater or equal of its children (max heap)

// Step 1 : Insert data to Binary Heap Tree
// Step 2 : Extract data from Binary Heap 


// Time Complexity : O(N logn)
// Space Complexity : O(1)


package SortingAlgorithms.HeapSort;

public class HeapSort{

    int[] arr = null;

    public HeapSort (int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        BinaryHeap bh = new BinaryHeap(arr.length);     // O(1)
        for (int i=0; i<arr.length; i++) {              // O(n)
            bh.insertInHeap(arr[i]);                    // O(Log n)
        }

        for (int i=0; i<arr.length; i++) {              // O(n)
            arr[i] = bh.extractHeadOfHeap();            // O(Log n)
        }

    }
    
   

    public void printArray(int[] array)
    {
        for (int i=0; i<array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
