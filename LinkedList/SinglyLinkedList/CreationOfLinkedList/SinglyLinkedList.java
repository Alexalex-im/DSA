
// Creation Of Singly Linked List 
// Create Head and Tail, initialize with null 
// Head | Tail

// Create a blank Node and assign a value to it and reference to null.
// Node 
// 1 | null 

// Link Head and Tail with these Node 

package LinkedList.SinglyLinkedList.CreationOfLinkedList;

public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        head = new Node();          // O(1)
        Node node = new Node();     // O(1)
        node.next = null;           // O(1)
        node.value = nodeValue;     // O(1)
        head = node;                // O(1)
        tail = node;                // O(1)
        size = 1;                   // O(1)
        return head;                // O(1)

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }
}
