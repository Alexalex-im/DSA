// Insertion to Linked List in Memory

// 1. At the beginning of the linked list.
// 2. After a node in the middle of Linked list
// 3. At the end of the linked list

// ppt


package LinkedList.SinglyLinkedList.InsertionInSinglyLinkedListInMemory;

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

    // Insert Method SinglyLinkedList

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();                 // O(1)
        node.value = nodeValue;                 // O(1)
        if (head == null) {                     
            createSinglyLinkedList(nodeValue);
            return;                             // O(1)
        } else if (location == 0) {
            node.next = head;
            head = node;                        // O(1)
        } else if(location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;                        // O(1)
        } else {
            Node tempNode = head;               // O(1)
            int index = 0;                      // O(1)
            while (index < location - 1) {
                tempNode = tempNode.next;       // O(1)
                index++;                        // O(1)
            }
            
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;               // O(1)
        }
        size++;                                 // O(1)

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }
}
