import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.offer(10);
        maxHeap.offer(30);
        maxHeap.offer(20);

        System.out.println("Max-Heap PriorityQueue: " + maxHeap);
        System.out.println("Peek (highest priority): " + maxHeap.peek());
    }
}
