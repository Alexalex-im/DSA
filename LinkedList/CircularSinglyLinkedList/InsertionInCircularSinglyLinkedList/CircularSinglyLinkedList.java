//          Insertion - Circular Singly Linked List 
//      - Insert at the beginning of linked list
//      - Insert at the specified location of linked list
//      - Insert at the end of linked list



package LinkedList.CircularSinglyLinkedList.InsertionInCircularSinglyLinkedList;

public class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue) {
        head = new Node();      // O(1)
        Node node = new Node();
        node.value = nodeValue;     // O(1)
        node.next = node;           // O(1)
        head = node;                // O(1)
        tail = node;                // O(1)
        size = 1;                   // O(1)
        return head;

        // Time Complexity : O(1)
        // Space Complexity : O(1)
    }

    public void insertCSLL(int nodeValue, int location){
        Node node = new Node();     // O(1)
        node.value = nodeValue;     // O(1)
        if (head == null) {         
            createCSLL(nodeValue);
            return;                 // O(1)
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;       // O(1)
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;       // O(1)
        } else {
            Node tempNode = head;
            int index = 0;          // O(1)
            while (index < location - 1) {  // O(n)
                tempNode = tempNode.next;
                index++;            // O(1)
            }
            node.next = tempNode.next;  // O(1)
            tempNode.next = node;       // O(1)
        }
        size++;

        // Time Complexity : O(N)
        // Space Complexity : O(1)
    }
}
