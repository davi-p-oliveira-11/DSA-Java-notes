/*
# 🥇 What is a Priority Queue?

A **Priority Queue** is a type of queue where **each element has a priority**, and **elements with higher priority are served before lower-priority ones**.
If two elements have the same priority, they’re processed according to their order in the queue (by default).

        In Java, the `PriorityQueue` class (in `java.util`) is implemented using a **binary heap**, making it efficient for retrieving the smallest (or largest) element.

        ---

        ## 🧩 Core Operations

| Operation | Description | Java Equivalent |
        |------------|--------------|----------------|
        | `add()` / `offer()` | Insert an element into the queue | `pq.add(x)` / `pq.offer(x)` |
        | `poll()` | Remove and return the element with highest priority (smallest by default) | `pq.poll()` |
        | `peek()` | View the element with highest priority without removing it | `pq.peek()` |
        | `isEmpty()` | Check if the queue is empty | `pq.isEmpty()` |
        | `size()` | Returns the number of elements | `pq.size()` |

        ---

        ## ⚙️ Example in Java

*/
import java.util.PriorityQueue;

public class PriorityQueueExample2 {
    public static void main(String[] args) {
        // By default, PriorityQueue is a min-heap (smallest element has highest priority)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println("PriorityQueue: " + pq);
        System.out.println("Peek (highest priority): " + pq.peek());

        pq.poll(); // removes the smallest element (10)
        System.out.println("After poll: " + pq);
    }
}
