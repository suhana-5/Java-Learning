package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
//        Dll ll=new Dll();
//        ll.insertFirst(4);
//        ll.insertFirst(33);
//        ll.insertFirst(44);
//        ll.insertFirst(45);
//        ll.displayRev();
//        ll.insertLast(44444);
//        ll.display();
//        ll.insert(4,44444444);
//        ll.display();
        CircularLinkedlist cl=new CircularLinkedlist();
        cl.insertLast(45);
        cl.insertLast(5);

        cl.display();
        cl.delete(45);
        cl.display();

    }
}
