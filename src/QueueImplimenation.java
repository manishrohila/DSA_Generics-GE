public class QueueImplimenation {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Enqueue elements into the queue
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        // Verify elements are enqueued
        System.out.println("Front element after enqueuing: " + queue.peek()); // Should print 56

        // Dequeue elements from the queue
        while (!queue.isEmpty()) {
            System.out.println("Dequeued element: " + queue.dequeue());
        }

        // Try to dequeue or peek from empty queue to see the exception
        try {
            queue.dequeue();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
