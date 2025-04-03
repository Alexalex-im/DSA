package LinkedList.DoublyLinkedList.InsertionDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(1);
        dll.insertDLL(2, 0);
        dll.insertDLL(3, 1);
        dll.insertDLL(3, 7);
        System.out.println(dll.head.next.value);
    }
}
