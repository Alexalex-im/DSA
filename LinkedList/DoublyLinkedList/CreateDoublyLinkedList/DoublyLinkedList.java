package LinkedList.DoublyLinkedList.CreateDoublyLinkedList;

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;

    public DoublyNode createDLL(int nodeValue) {
        head = new DoublyNode();                    // O(1)
        DoublyNode newNode = new DoublyNode();      // O(1)
        newNode.value = nodeValue;      
        newNode.next = null;        // O(1)
        newNode.prev = null;        // O(1)
        head = newNode;             // O(1)
        tail = newNode;             // O(1)
        size = 1;                   // O(1)
        return head;                // O(1)

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }
}
