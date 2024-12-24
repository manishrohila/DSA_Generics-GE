import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    // Push element onto the stack
    public void push(int data) {
        stack.addFirst(data);
    }

    // Peek the top element of the stack
    public int peek() {
        if (!stack.isEmpty()) {
            return stack.getFirst();
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }

    // Pop element from the stack
    public int pop() {
        if (!stack.isEmpty()) {
            return stack.removeFirst();
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
