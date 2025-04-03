package QueueDataStructure.QueueOperationsUsingLinkedList.CreateEnqueandisEmptyMethodinQueueUsingLinkedList;


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
}