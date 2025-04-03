//          Deletion - Circular Doubly Linked List

//      - Deleting the first node
//      - Deleting any given node 
//      - Deleting the last node

//      Deleting the first node 
//          case 1 - one node

//      Deleting the first node
//          case 2 - more than one node

//      Delete any given node

//      Delete the last node
//          case 1 - one,node 

//      Delete the last node
//          Case 2 - more than one node

   

package LinkedList.CircularDoublyLinkedList.DeletionInCircularDoublyLinkedList;

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
            tail.next = newNode;
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

    //  Traverse CDLL

    void traverseCDLL() {
        if (head != null) {                 // O(1)
            DoublyNode tempNode = head;     // O(1)
            for (int i=0; i<size; i++) {    // O(n)
                System.out.println(tempNode.value); // O(1)
                if (i != size - 1) {            // O(1)
                    System.out.println(" -> ");     // O(1)
                }
                tempNode = tempNode.next;       // O(1)
            }
        } else {
            System.out.println("The CDLL does not exist."); // O(1)
        }
        System.out.println();       // O(1)

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }

    // Reverse Traversal
    void reverseTraversalCDLL() {
        if (head != null) {                 // O(1)
            DoublyNode tempNode = tail;     // O(1)
            for (int i=0; i<size; i++) {    // O(n)
                System.out.println(tempNode.value);     // O(1)
                if (i != size-1){           // O(1)
                    System.out.println(" <- ");     // O(1)
                }
                tempNode = tempNode.prev;           // O(1)
            }
        } else {
            System.out.println("The CDLL does not exist!");     // O(1)
        }

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }

    // Search for a Node

    boolean searchNode(int nodeValue) {
        if (head != null) {                 // O(1)
            DoublyNode tempNode = head;     // O(1)
            for (int i=0; i<size; i++) {    // O(n)
                if (tempNode.value == nodeValue) {      // O(1)
                    System.out.println(" The node is found at location: "); // O(1)
                    return true;            // O(1)
                }
                tempNode = tempNode.next;   // O(1)
            }
        }
        System.out.println(" Node not found!"); // O(1)
        return false;           // O(1)

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }


    // Deletion Method

    public void deleteNode(int location) {
        if (head == null) {                 // O(1)
            System.out.println(" The CDLL does not exist!");
            return;                         // O(1)
        } else if (location == 0) {
            if (size == 1) {
                head.prev = null;
                head.next = null;
                head = tail = null;
                size--;                      // O(1)
                return;
            } else {
                head = head.next;
                head.prev = tail;
                tail.next = head;
                size--;                       // O(1)
            }
        } else if (location >= size) {
            if (size == 1) {
                head.prev = null;
                head.next = null;
                head = tail = null;
                size--;                             // O(1)
                return;
            } else {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;                             // O(1)
            }
        } else {
            DoublyNode tempNode = head;
            for (int i=0; i<location-1; i++) {      // O(n)
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;                                 // O(1)
        }
        
        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }

}
