package QueueDataStructure.WhyCircularQueue.CreateEnqueueisFullandisEmptyMethodsinCircularQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue newCircularQueue = new CircularQueue(3);

        // isEmpty
        // boolean result = newCircularQueue.isEmpty();
        // System.out.println(result);

        // isFull
        // boolean result = newCircularQueue.isFull();
        // System.out.println(result);

        newCircularQueue.enQueue(10);
        newCircularQueue.enQueue(20);
        newCircularQueue.enQueue(30);
        newCircularQueue.enQueue(40);

    }
}
