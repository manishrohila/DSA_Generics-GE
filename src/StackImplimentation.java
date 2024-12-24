public class StackImplimentation {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // UC1: Create a Stack and push elements
        stack.push(70);
        stack.push(30);
        stack.push(56);

        // Verify elements are pushed
        System.out.println("Top element after pushing: " + stack.peek()); // Should print 56

        // UC2: Peek and pop elements till the stack is empty
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }

        // Try to peek or pop from empty stack to see the exception
        try {
            stack.peek();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
