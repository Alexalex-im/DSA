package QueueDataStructure.DequeuePeekandDeleteMethodsusingLinearQueue;


public class Main {
    public static void main(String[] args) {
        QueueArray newQueue = new QueueArray(5);

        // isFull
        // boolean result = newQueue.isFull();
        // System.out.println(result);


        // isEmpty
        // boolean result = newQueue.isEmpty();
        // System.out.println(result);

        // newQueue.enQueue(1);
        // newQueue.enQueue(2);
        // newQueue.enQueue(3);
        // newQueue.enQueue(4);
        // newQueue.enQueue(5);
        // newQueue.enQueue(6);

        // newQueue.enQueue(1);
        // newQueue.enQueue(2);
        // newQueue.enQueue(3);
        // int result = newQueue.deQueue();
        // System.out.println(result);
        // int result1 = newQueue.deQueue();
        // System.out.println(result1);

        // newQueue.enQueue(1);
        // newQueue.enQueue(2);
        // newQueue.enQueue(3);
        // int result = newQueue.Peek();
        // System.out.println(result);
        // int result1 = newQueue.Peek();
        // System.out.println(result1);

        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        newQueue.deleteQueue();

    }
}
