public class InsertHead {
    public static Node insertHead(Node head,int val)
    {
        Node temp = new Node(val,head);
        return temp;
    }
}
