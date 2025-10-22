/*
# 🎟️ What is a Queue?

        A **queue** is a **First In, First Out (FIFO)** data structure.
        Think of it like a **line of people waiting for tickets** — the first person to enter the line is the first one to be served.

        ---

        ## 🧩 Core Operations

        | Operation | Description | Java Equivalent |
        |------------|--------------|----------------|
        | `add()` / `offer()` | Add an element to the rear | `queue.add(x)` or `queue.offer(x)` |
        | `remove()` / `poll()` | Remove and return the front element | `queue.remove()` or `queue.poll()` |
        | `element()` / `peek()` | View the front element without removing it | `queue.element()` or `queue.peek()` |
        | `isEmpty()` | Check if the queue is empty | `queue.isEmpty()` |
        | `size()` | Returns number of elements | `queue.size()` |

        ---

        ## ⚙️ Example in Java

 */

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample2 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Add elements
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("C++");

        System.out.println("Queue: " + queue);

        // Peek the front element
        System.out.println("Front element: " + queue.peek());

        // Remove element
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after removal: " + queue);

        // Size and check empty
        System.out.println("Queue size: " + queue.size());
        System.out.println("Is empty? " + queue.isEmpty());
    }
}

/*🧩 Practice Challenge (Optional)

Problem:
Write a program to reverse a queue using a stack.

Hint:

Dequeue all elements and push them into a stack.

Pop all elements from the stack and enqueue them back into the queue.
*
* */
