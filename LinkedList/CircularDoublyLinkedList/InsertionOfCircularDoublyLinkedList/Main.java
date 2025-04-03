package LinkedList.CircularDoublyLinkedList.InsertionOfCircularDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCDLL(1);
        // cdll.insertNode(2, 0);
        cdll.insertNode(2, 1);
        System.out.println(cdll.head.value);
    }
}
