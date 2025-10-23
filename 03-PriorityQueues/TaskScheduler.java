import java.util.PriorityQueue;

public class TaskScheduler {
    public static void main(String[] args) {
        PriorityQueue<Task> tasks = new PriorityQueue<>();

        tasks.offer(new Task("Write report", 3));
        tasks.offer(new Task("Fix bugs", 1));
        tasks.offer(new Task("Attend meeting", 2));

        while (!tasks.isEmpty()) {
            System.out.println("Processing: " + tasks.poll());
        }
    }
}