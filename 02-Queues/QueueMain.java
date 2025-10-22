public class QueueMain {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.printQueue();

        System.out.println("Front: " + q.peek());
        q.dequeue();
        q.printQueue();
    }
}
