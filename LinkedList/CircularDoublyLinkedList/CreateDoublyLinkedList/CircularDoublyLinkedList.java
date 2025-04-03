package LinkedList.CircularDoublyLinkedList.CreateDoublyLinkedList;

public class CircularDoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;

    // Create CDLL
    DoublyNode createCDLL(int nodeValue) {
        head = new DoublyNode();                // O(1)
        DoublyNode newNode = new DoublyNode();  // O(1)
        newNode.value = nodeValue;              // O(1)
        head = newNode;
        tail = newNode;
        newNode.next = newNode;                 // O(1)
        newNode.prev = newNode;                 // O(1)
        size = 1;
        return head;                            // O(1)

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }
}
