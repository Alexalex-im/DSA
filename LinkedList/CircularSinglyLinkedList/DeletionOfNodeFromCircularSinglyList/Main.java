package LinkedList.CircularSinglyLinkedList.DeletionOfNodeFromCircularSinglyList;

public class Main {
    public static void main(String[] args)
    {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        csll.insertCSLL(4,0);
        csll.insertCSLL(6,1);
        csll.insertCSLL(7,8);
        // System.out.println(csll.head.next.value);
        csll.traverseCSLL();
        // csll.searchNode(5);
        // csll.searchNode(10);
        csll.deleteNode(0);
        csll.traverseCSLL();
        csll.deleteNode(8);
        csll.traverseCSLL();

    }
}
