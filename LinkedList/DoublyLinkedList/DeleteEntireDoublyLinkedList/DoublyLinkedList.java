//           Deletion - Doubly Linked List
//      - Deleting the first node
//      - Deleting any given node
//      - Deleting the last node

//      Deletion the first node
//          case 1 - one node

//      Deletion the first node
//          case 2 - more than one node

//      Deleting any given node


package LinkedList.DoublyLinkedList.DeleteEntireDoublyLinkedList;

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

    // Insertion Method
    public void insertDLL(int nodeValue, int location) {
        DoublyNode newNode = new DoublyNode();      // O(1)
        newNode.value = nodeValue;                  // O(1)
        if (head == null) {                 // O(1)
            createDLL(nodeValue);           // O(1)
            return;
        } else if (location == 0) {         // O(1)
            newNode.next = head;            // O(1)
            newNode.prev = null;            // O(1)
            head.prev = newNode;            // O(1)
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;            // O(1)
            tail.next = newNode;            // O(1)
            newNode.prev = tail;            // O(1)
            tail = newNode;                 // O(1)
        } else {
            DoublyNode tempNode = head;     // O(1)
            int index = 0;                  // O(1)
            while (index < location-1) {    // O(n)
                tempNode = tempNode.next;   // O(n)
                index++;                    // O(n)
            }
            newNode.prev = tempNode;        // O(1)
            newNode.next = tempNode.next;   // O(1)
            tempNode.next = newNode;        // O(1)
            newNode.next.prev = newNode;    // O(1)
        }
        size++;                             // O(1)
        
        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }

    // Traverse DLL

    public void traverseDLL() {
        if (head != null) {                 // O(1)
            DoublyNode tempNode = head;     // O(1)
            for (int i=0; i<size; i++) {    // O(n)
                System.out.println(tempNode.value); // O(1)
                if (i != size - 1) {                // O(1)
                    System.out.println(" -> ");   // O(1)
                }
                tempNode = tempNode.next;       // O(1)
            }
        } else {
            System.out.println("The DLL does not exist!");  // O(1)
        }
        System.out.println("\n");       // O(1)

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }

    // Search node

    public boolean searchNode(int nodeValue) {
        if (head != null) {                         // O(1)
            DoublyNode tempNode = head;             // O(1)
            for (int i=0; i<size; i++) {            // O(n)
                if (tempNode.value == nodeValue) {  // O(1)
                    System.out.println("The Node is found at location: " +i);   // O(1)
                    return true;                    // O(1)
                }
                tempNode = tempNode.next;           // O(1)
            }
        }
        System.out.println("Node not found!");      // O(1)
        return false;                                   // O(1)

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }

    // Deletion Method
    public void deleteNodeDLL(int location) {
        if (head == null) {                         // O(1)
            System.out.println(" The DLL does not exist!");     // O(1)
            return;
        } else if (location == 0) {                 // O(1)
            if (size == 1) {                        // O(1)
                head = null;
                tail = null;
                size--;                             // O(1)
                return;                             // O(1)
            } else {
                head = head.next;
                head.prev = null;
                size--;                             // O(1)
            }
        } else if (location >= size) {
            DoublyNode tempNode = tail.prev;        // O(1)
            if (size == 1) {                        // O(1)
                head = null;
                tail = null;
                size--;                             // O(1)
                return;
            } else {
                tempNode.next = null;
                tail = tempNode;
                size--;                             // O(1)
            }
        } else {
            DoublyNode tempNode = head;
            for (int i=0; i<location-1; i++) {
                tempNode = tempNode.next;               // O(n)
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;                                     // O(1)
        }

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }

    // Delete entire DLL

    public void deleteDLL() {
        DoublyNode tempNode = head;         // O(1)
        for (int i=0; i<size; i++) {        // O(n)
            tempNode.prev = null;           // O(1)
            tempNode = tempNode.next;       // O(1)
        }
        head = null;                        // O(1)
        tail = null;                        // O(1)
        System.out.println("The DLL has been deleted!"); // O(1)

        // Time Complexity : O(n)
        // Space Complexity : O(1)
    }

    
}
