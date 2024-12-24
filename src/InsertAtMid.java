public class InsertAtMid {
    public static void insertBetween(Node head, int data, int after, int before) {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == after && current.next.data == before) {
                Node newNode = new Node(data);
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
    }
}
