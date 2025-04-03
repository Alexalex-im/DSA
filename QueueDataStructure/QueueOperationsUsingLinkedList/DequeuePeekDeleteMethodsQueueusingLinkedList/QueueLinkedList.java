package QueueDataStructure.QueueOperationsUsingLinkedList.DequeuePeekDeleteMethodsQueueusingLinkedList;


public class QueueLinkedList {
    LinkedList list;

    public QueueLinkedList() {
        list = new LinkedList();                    // O(1)
        System.out.println("The Queue is successfully created");      // O(1)

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }

    // isEmpty 

    public boolean isEmpty() {
        if (list.head == null) {    // O(1)
            return true;            // O(1)
        } else {
            return false;           // O(1)
        }

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }

    // enQueue

    public void enQueue (int value) {
        list.InsertInLinkedList(value, list.size);      // O(1)
        System.out.println("Successfully inserted " +value+ " in the queue");   // O(1)

        // Time Complexity : O(1)
        // Space Complexity : O(1)        
    }

    // deQueue
    public int deQueue() {
        int value = -1;     // O(1)
        if (isEmpty()) {    // O(1)
            System.out.println(" The Queue is Empty!");     // O(1)
        } else {                   
            value = list.head.value;    // O(1)
            list.deletionOfNode(0); // O(1)
        }
        return value;       // O(1)

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }

    // Peek
    public int Peek() {
        if(isEmpty()) {         // O(1)
            System.out.println("The Queue is Empty");      // O(1)
            return -1;          // O(1)
        } else {
            return list.head.value; // O(1)
        }

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }

    // Delete
    public void deleteQueue() {
        list.head = null;                       // O(1)
        list.tail = null;                       // O(1)
        System.out.println("The Queue is successfully deleted");    // O(1)

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }
}