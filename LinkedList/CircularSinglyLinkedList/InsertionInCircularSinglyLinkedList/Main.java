package LinkedList.CircularSinglyLinkedList.InsertionInCircularSinglyLinkedList;

public class Main {
    public static void main(String[] args)
    {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        csll.insertCSLL(4,0);
        csll.insertCSLL(4,1);
        csll.insertCSLL(4,8);
        System.out.println(csll.head.next.value);
    }
}
