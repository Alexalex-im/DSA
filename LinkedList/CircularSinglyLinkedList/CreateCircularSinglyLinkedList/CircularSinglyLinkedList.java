package LinkedList.CircularSinglyLinkedList.CreateCircularSinglyLinkedList;

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
}
