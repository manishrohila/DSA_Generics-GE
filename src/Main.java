import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println(list);

        Node head = new Node(16);
        head.next= new Node(30);
        head.next.next=new Node(70);
        System.out.println("Insert at Head");
        head= InsertHead.insertHead(head,30);
        head=InsertHead.insertHead(head,56);
        PrintLL.printLL(head);
        System.out.println();
        System.out.println("insert at End");
        head = InsertAtEnd.append(head,100);
        head = InsertAtEnd.append(head,200);
        PrintLL.printLL(head);
        System.out.println("\nInsert between 30 and 16");
        InsertAtMid.insertBetween(head,400,16,30);
        PrintLL.printLL(head);
        System.out.println("\nDelete the first Element");
        head=DeleteElement.popFirst(head);
        PrintLL.printLL(head);

        System.out.println("\nDelete the Last Element");
        head =DeleteElement.popLast(head);
        PrintLL.printLL(head);

    }
}