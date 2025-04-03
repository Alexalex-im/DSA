// Traversal of Singly Linked List 

//  Head | 001 ---> 1 | 111 ---> 2 | 222 ---> 4 | 333 ---> 5 | null 


package LinkedList.SinglyLinkedList.TraversalOfSinglyLinkedList;

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

    // SinglyLinkedList Traversal 

    public void traverseSinglyLinkedList() {
        if (head == null) {                         // O(1)
            System.out.println("SLL does not exist !");
        } else {
            Node tempNode = head;               // O(1)
            for (int i=0; i<size; i++) {        // O(n)
                System.out.println(tempNode.value); // O(1)
                if ( i != size - 1) {           // O(1)
                    System.out.println(" -> ");
                }
                tempNode = tempNode.next;       // O(1)
            }
        }
        System.out.println("\n");
    }

    // Time Complexity : O(n)
    // Space Complexity : O(1)
}
