package SingleLinkedList;

public class Main {
    public static void main(String[] args) {
        CustomLinkedlist ll=new CustomLinkedlist();
        ll.insertFirst(3);
        ll.insertFirst(4);
        ll.dispaly();
        ll.insertLast(3333);
       ll.dispaly();
       ll.insertatindex(4,1);
        ll.dispaly();
        ll.deleteFirst();
        System.out.println(ll.deleteFirst());
        ll.dispaly();
        ll.deleteLast();
        ll.dispaly();
        ll.deleteAtindex(0);
        ll.display();
        ll.find(3);
        ll.dispaly();
    }
}
