//          Searching - Circular Singly Linked List 
//      print (node1.value)     ------> 1
//      print (node2.value)     ------> 2
//      print (node3.value)     ------> 3
//      print (node4.value)     ------> 4




package LinkedList.CircularSinglyLinkedList.SearchingNodeInCircularSinglyLinkedList;

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

    //  Traversal Method

    public void traverseCSLL() {
        if (head != null) {                 // O(1)
            Node tempNode = head;           // O(1)
            for (int i=0; i<size; i++) {    // O(1)
                System.out.println(tempNode.value);     // O(n)
                if (i != size-1) {                  
                    System.out.println(" ->");      // O(1)
                }
                tempNode = tempNode.next;           // O(1)
            }
            System.out.println("\n");
        } else {
            System.out.println("\n CSLL does not exist!");  // O(n)
        }

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }

    //  Search Method

    public boolean searchNode(int nodeValue) {
        if (head != null) {                 // O(1)
            Node tempNode = head;           // O(1)
            for (int i=0; i<size; i++) {    // O(n)
                if (tempNode.value == nodeValue) {
                    System.out.println("Found node at location : " + i);
                    return true;              // O(1)
                }
                tempNode = tempNode.next;       // O(1)
            }
        }
        System.out.println("Node not found!");  // O(1)
        return false;

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }
}
