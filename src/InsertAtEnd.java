public class InsertAtEnd {
    public static Node append(Node head, int newData) {

        // Create a new node
        Node newNode = new Node(newData);

        // If the Linked List is empty, make the new
        // node as the head and return
        if (head == null) {
            return newNode;
        }

        // Store the head reference in a temporary variable
        Node last = head;

        // Traverse till the last node
        while (last.next != null) {
            last = last.next;
        }

        // Change the next pointer of the
        // last node to point to the new node
        last.next = newNode;

        // Return the head of the list
        return head;
    }
}
