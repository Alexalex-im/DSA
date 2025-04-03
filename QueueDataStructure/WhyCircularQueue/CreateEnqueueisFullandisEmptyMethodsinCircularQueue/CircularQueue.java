package QueueDataStructure.WhyCircularQueue.CreateEnqueueisFullandisEmptyMethodsinCircularQueue;

public class CircularQueue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    public CircularQueue (int size) {
        this.arr = new int[size];       // O(1)
        this.size = size;               // O(1)
        this.topOfQueue = -1;           // O(1)
        this.beginningOfQueue = -1;     // O(1)
        System.out.println("The Circular Queue is successfully created with size of " + size);      // O(1)

        // Time Complexity : O(1)
        // Space Complexity : O(n)
    }


    // isEmpty

    public boolean isEmpty() {
        if(topOfQueue == -1) {      // O(1)
            return true;            // O(1)
        } else {
            return false;           // O(1)
        }

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }

    // isFull

    public boolean isFull() {
        if (topOfQueue+1 == beginningOfQueue) {     // O(1)
            return true;                            // O(1)
        } else if(beginningOfQueue == 0 && topOfQueue+1 == size) {     // O(1)
            return true;        // O(1)
        } else {
            return false;       // O(1)
        }

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }

    // enQueue

    public void enQueue(int value) {
        if (isFull()) {                     // O(1)
            System.out.println("The CQ is full!");      // O(1)
        } else if (isEmpty()) {             // O(1)
            beginningOfQueue = 0;           // O(1)
            topOfQueue++;                   // O(1)
            arr[topOfQueue] = value;        // O(1)
            System.out.println(" Successfully inserted " + value + " in the queue");    // O(1)
        } else {
            if (topOfQueue+1 == size) {     // O(1)
                topOfQueue = 0;             // O(1)
            } else {
                topOfQueue++;               // O(1)
            }
            arr[topOfQueue] = value;        // O(1)
            System.out.println(" Successfully inserted " + value + " in the queue" ); // O(1)
        }

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }
}
