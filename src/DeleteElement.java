public class DeleteElement {
    public static Node popFirst(Node head){
        return head.next;
    }
    public static Node popLast(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node last = head;
        if(last != null && last.next!=null){
            while (last.next.next!=null){
                last = last.next;

            }
            last.next=null;
        }
        return head;
    }
}
