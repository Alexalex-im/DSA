package LinkedList.DoublyLinkedList.CreateDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDLL(1);
        System.out.println(dll.head.value);
    }
}
