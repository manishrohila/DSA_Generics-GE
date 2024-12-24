import java.util.LinkedList;

public class Queue {
    private LinkedList<Integer> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    // Enqueue element into the queue
    public void enqueue(int data) {
        queue.addLast(data);
    }

    // Dequeue element from the queue
    public int dequeue() {
        if (!queue.isEmpty()) {
            return queue.removeFirst();
        } else {
            throw new RuntimeException("Queue is empty");
        }
    }

    // Peek the front element of the queue
    public int peek() {
        if (!queue.isEmpty()) {
            return queue.getFirst();
        } else {
            throw new RuntimeException("Queue is empty");
        }
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
