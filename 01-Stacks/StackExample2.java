import java.util.Stack;
/*
# 🧱 What is a Stack?

A **stack** is a **Last In, First Out (LIFO)** structure.
Think of it like a **stack of plates** — you add new plates on top, and you remove them from the top as well.

---

        ## 🧩 Core Operations

| Operation | Description | Java Equivalent |
        |------------|--------------|----------------|
        | `push()` | Add an element to the top | `stack.push(x)` |
        | `pop()` | Remove the top element | `stack.pop()` |
        | `peek()` | View the top element without removing it | `stack.peek()` |
        | `isEmpty()` | Check if the stack is empty | `stack.isEmpty()` |
        | `size()` | Returns number of elements | `stack.size()` |

 */


public class StackExample2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Stack: " + stack);

        // Peek top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Check size and empty
        System.out.println("Stack size: " + stack.size());
        System.out.println("Is empty? " + stack.isEmpty());
    }
}
