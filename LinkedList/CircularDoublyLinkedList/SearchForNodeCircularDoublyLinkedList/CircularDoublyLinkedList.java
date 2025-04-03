//          Search - Circular Doubly Linked List

//      print(node4.value) ----------> 4
//      print(node3.value) ----------> 3
//      print(node2.value) ----------> 2
//      print(node1.value) ----------> 1
   

package LinkedList.CircularDoublyLinkedList.SearchForNodeCircularDoublyLinkedList;

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
                    System.out.println(" The node is found at location: " + i); // O(1)
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

}
