package QueueDataStructure.CreateisFullisEmptyandenQueuemethodsusingLinearQueue;

public class QueueArray {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray (int size) {
        this.arr = new int[size];           // O(1)
        this.topOfQueue = -1;               // O(1)
        this.beginningOfQueue = -1;         // O(1)
        System.out.println("The Queue is successfully created with size of: " + size);      // O(1)

    // Time Complexity : O(1)
    // Space Complexity : O(N)

    }

    // isFull
    public boolean isFull() {
        if (topOfQueue == arr.length-1) {       // O(1)
            return true;            // O(1)
        } else {
            return false;           // O(1)
        }

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }

    // isEmpty
    public boolean isEmpty() {
        if ((beginningOfQueue == -1) || (beginningOfQueue == arr.length)) {
            return true;
        } else {
            return false;
        }

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }

    // EnQueue
    public void enQueue (int value) {
        if (isFull()) {             // O(1)
            System.out.println("The Queue is Full !");      // O(1)
        } else if(isEmpty()) {          // O(1)
            beginningOfQueue = 0;       
            topOfQueue++;               // O(1)
            arr[topOfQueue] = value;    // O(1)
            System.out.println("Successfully inserted " + value);   // O(1)
        } else {
            topOfQueue++;           // O(1)
            arr[topOfQueue] = value;    // O(1)
            System.out.println("Successfully inserted " + value + " in the queue"); // O(1)
        }

        // Time Complexity : O(1)
        // Space Complexity : O(1)
        
    }
    
    
}
