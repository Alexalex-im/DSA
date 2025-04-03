// Common Operation on Binary Heap 

// - Creation of Binary Heap,
// - Peek top of Binary heap 
// - Extract Min/Extract Max
// - Traversal of Binary heap 
// - Size of Binary Heap 
// - Insert value in Binary Heap 
// - Delete the entire Binary heap 

// Implementation Options
//      - Array Implementation 
//      - Reference / Pointer implementation

//   Creation of Binary Heap 
//   Initialize Array
//   set size of Binary Heap to 0

//  Creating an Array
//  Time Complexity: O(1)
//  Space Complexity: O(n)

// Peek of Binary Heap
// Return Array[1]
// Time Complexity: O(1)
// Space Complexity: O(1)


// size Binary heap
// Return number of filled cells
// Time Complexity: O(n)
// Space Complexity: O(1)

// Insert a Node in Binary heap
// Time Complexity: O(LogN)
// Space Complexity: O(Logn)


package BinaryHeap.InsertNodeInBinaryHeap;

public class Main {
    public static void main(String[] args){
    BinaryHeap newBH = new BinaryHeap(5);

    // Peek
    newBH.peek();

    // Level Order travrsal
    // newBH.levelOrder();

    // Insert a node
    newBH.insert(10, "Min");
    newBH.insert(5, "Min");
    newBH.insert(15, "Min");
    newBH.insert(1, "Min");
    // 1 5 15 10
    // newBH.insert(10, "Max");
    // newBH.insert(5, "Max");
    // newBH.insert(15, "Max");
    // newBH.insert(1, "Max");

    //level order traversal
    newBH.levelOrder();


}
}