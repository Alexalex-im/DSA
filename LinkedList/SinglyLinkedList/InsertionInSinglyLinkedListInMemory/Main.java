package LinkedList.SinglyLinkedList.InsertionInSinglyLinkedListInMemory;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5); 
        System.out.println(sLL.head.value);

        // sLL.insertInLinkedList(6, 0);
        sLL.insertInLinkedList(6, 1);
        // sLL.insertInLinkedList(6, 3);
        sLL.insertInLinkedList(7, 3);
        System.out.println(sLL.head.next.next.value);

    }
    
}
