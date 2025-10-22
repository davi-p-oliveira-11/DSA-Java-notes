class MyQueue {
    private int[] arr;
    private int front, rear, size, capacity;

    MyQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        size = 0;
        rear = -1;
    }

    public void enqueue(int x) {
        if (size == capacity) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int x = arr[front];
        front = (front + 1) % capacity;
        size--;
        return x;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

