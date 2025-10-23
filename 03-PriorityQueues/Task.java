import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        // Lower priority number = higher importance
        return this.priority - other.priority;
    }

    @Override
    public String toString() {
        return name + " (priority: " + priority + ")";
    }
}


