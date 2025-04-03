//          Insertion - Circular Doubly Linked List

//      - Insert at the beginning of linked list
//      - Insert at the specified location of linked list
//      - Insert at the end of linked list


package LinkedList.CircularDoublyLinkedList.InsertionOfCircularDoublyLinkedList;

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

    // Insertion Method
    void insertNode(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();          // O(1)
        newNode.value = nodeValue;
        if (head == null) {                             // O(1)
            createCDLL(nodeValue);
            return;                                     // O(1)
        } else if (location == 0) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;                             // O(1)
        } else if (location >= size) {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail = newNode;                             // O(1)
        } else {
            DoublyNode tempNode = head;
            int index = 0;                              // O(1)
            while (index < location -1) {               // O(n)
                tempNode = tempNode.next;
                index++;                                // O(1)
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;                // O(1)
        }
        size++;                                         // O(1)

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }
}
