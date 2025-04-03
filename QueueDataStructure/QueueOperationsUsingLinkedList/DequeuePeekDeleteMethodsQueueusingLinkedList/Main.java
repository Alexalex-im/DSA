package QueueDataStructure.QueueOperationsUsingLinkedList.DequeuePeekDeleteMethodsQueueusingLinkedList;

public class Main{
    public static void main(String[] args) {
        QueueLinkedList newQLL = new QueueLinkedList();

        // isEmpty
        // boolean result = newQLL.isEmpty();
        // System.out.println(result);

        // newQLL.enQueue(10);
        // newQLL.enQueue(20);
        // newQLL.enQueue(30);
        // int result = newQLL.deQueue();
        // System.out.println(result);
        // int result1 = newQLL.deQueue();
        // System.out.println(result1);

        // newQLL.enQueue(10);
        // newQLL.enQueue(20);
        // newQLL.enQueue(30);
        // int result = newQLL.Peek();
        // System.out.println(result);
        // int result1 = newQLL.Peek();
        // System.out.println(result1);

        newQLL.enQueue(10);
        newQLL.enQueue(20);
        newQLL.enQueue(30);
        newQLL.deleteQueue();

    }
}