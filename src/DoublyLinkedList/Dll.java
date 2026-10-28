package DoublyLinkedList;

public class Dll {
    Node head;
   // Node tail;
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.pre=null;
        if(head!=null){
            head.pre=node;
        }
        head=node;
    }

    public void insertLast(int val){
        Node node=new Node(val);
        Node last=head;
        node.next=null;
        if(head==null){
            node.pre=null;
            head=node;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
            last.next=node;
            node.pre=last;




    }public Node find(int val){
        Node node=head;
        while(node!=null){
            if(node.val==val){
                return node;
            }node=node.next;
        }return null;
    }
    public void insert(int after,int val){
        Node p=find(after);
        if(p==null){
            System.out.println("doesnot exist");
        }Node node=new Node(val);
          node.next=p.next;
          p.next=node;
          node.pre=p;
          if(node.next!=null){
              node.next.pre=node;
          }


    }


    public void display(){
        Node node=head;

        while(node!=null){
            System.out.print(node.val+"->");
            node=node.next;
        }
        System.out.println("end");
    }
    public void displayRev(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.val+"->");
            last=node;
            node=node.next;
        }
        System.out.println("end");
        System.out.println("reverse");
        while (last!=null){
            System.out.print(last.val+"->");
            last=last.pre;
        }
        System.out.println("start");
    }










    private class Node {
        int val;
        Node pre;
        Node next;

        public Node(int val) {
            this.val = val;
        }
        public Node(int val,Node next,Node  pre){
            this.val=val;
            this.next=next;
            this.pre=pre;
        }

    }
}