package StackDataStructure.StackMethodPushPopPeekDeleteandisEmptyUsingLinkedList;

public class Stack {
    LinkedList linkedList;

    public Stack() {
        linkedList = new LinkedList();
    }


    // Push method

    public void push (int value) {
        linkedList.InsertInLinkedList(value, 0);        // O(1)
        System.out.println("Inserted " + value + " In Stack");   // O(1)

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }

    // isEmpty

    public boolean isEmpty() {
        if (linkedList.head == null) {      // O(1)
            return true;                    // O(1)
        } else {
            return false;                   // O(1)
        }

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }


    // Pop Method
    public int Pop() {
        int result = -1;            // O(1)
        if (isEmpty()) {            // O(1)
            System.out.println("The Stack is Empty");   // O(1)
        } else {
            result = linkedList.head.value;         // O(1)
            linkedList.deletionOfNode(0);   // O(1)
        }
        return result;          // O(1)

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }

    // Peek Method
    public int peek() {
        if (isEmpty()) {            // O(1)
            System.out.println("The Stack is Empty");   // O(1)
            return -1;              // O(1)
        } else {
            return linkedList.head.value;         // O(1)
            
        }  
        
        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }

    // Delete Method
    public void deleteStack() {
        linkedList.head = null;
        System.out.println("The Stack is deleted");
    }
}
