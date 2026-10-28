package SingleLinkedList;

import java.util.List;

public class CustomLinkedlist {
    private Node head;
    private Node tail;

    private int size ;
    public CustomLinkedlist(){
        this.size=0;
    }

    public void dispaly(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("end");
    }
    public void display(){
        dispaly();
    }
 public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
 }
public void insertLast(int val){
    if(tail==null){
        insertFirst(val);
        return;
    }
        Node node=new Node(val);
        tail.next=node;
        tail=node;

        size+=1;
}
public void insertatindex(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }if(index==size){
            insertLast(val);
            return;
    }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size+=1;

}
public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
           tail=null;
        }
        size--;
        return val;

}

public Node find(int val){
        Node node=head;
        while(node!=null){
            if(node.value==val){
                return node;
            }node=node.next;

        }return node;
}
public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return null;

}

public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;

    }
    public int deleteAtindex(int index){
        if(index==0){
           return   deleteFirst();
        }if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;

    }
    private class Node{
    private int value;
    private  Node next;

//    public CustomLinkedlist(){
//        this.size=0;
//    }

        public Node(int value){
            this.value=value;
        }
    public Node(int value,Node next){
        this.value=value;
        this.next=next;
    }}
   public void duplicates(){
        Node node=head;

        while(node.next!=null){
            if(node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }else{
                node=node.next;
            }
        }tail=node;
        tail.next=null;
    }
    ///merge
     public static CustomLinkedlist merge(CustomLinkedlist first,CustomLinkedlist second){
         Node s=first.head;
         Node t=second.head;
         CustomLinkedlist ans=new CustomLinkedlist();

         while(s!=null&&t!=null){
             if(s.value<t.value){
                 ans.insertLast(s.value);
                 s=s.next;

             }else{
                 ans.insertLast(t.value);
                 t=t.next;
             }
         }
         while (s!=null){
             ans.insertLast(s.value);
             s=s.next;
         }
         while (t!=null){
             ans.insertLast(t.value);
             t=t.next;
         }return ans;
     }

//    public static void main(String[] args) {
//        CustomLinkedlist ll=new CustomLinkedlist();
//        ll.insertLast(4);
//        ll.insertLast(4);
//        ll.insertLast(4);
//        ll.insertLast(3);
//        ll.duplicates();
//        ll.dispaly();
//
//
//    }

    public static boolean hasCycle(CustomLinkedlist list){
        Node fast=list.head;
        Node slow=list.head;

        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }return false;

    }//lenght of fthe cycle
    public static int countnoofelmentscycle(CustomLinkedlist list){
         Node fast=list.head;
         Node slow=list.head;

         while (fast!=null&&slow!=null){
             fast=fast.next.next;
             slow=slow.next;

             if(fast==slow){
                 Node temp=slow;
                 int length=0;
                 do{
                     temp=temp.next;
                     length++;
                 }while (temp!=slow);
                 return length;
             }
         }return 0;
    }
    public static boolean happyno(int n){
         int slow=n;
         int fast=n;
         do{
             slow=findSquare(slow);
             fast=findSquare(findSquare(fast));

         }while (slow!=fast);
         if(slow==1){
             return true;
         }else{
             return false;
         }

    }private static int findSquare(int n){
         int ans=0;
         while(n>0){
             int rem=n%10;
             ans=ans+rem*rem;
             n=n/10;
         }
         return ans;
    }
    public static Node Middleelement(CustomLinkedlist list){
         Node fast=list.head;
         Node  slow=list.head;
         while (fast!=null&&fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;


         }return slow;
    }
    //recursion reverse linked list
     //takes extra space
    private void reverse(Node node){
         if(node==tail){
             head=tail;
             return;
         }
         reverse(node.next);
         tail.next=node;
         tail=node;
         tail.next=null;
    }
    //in place reversal of linked list
    public void reverseLinkedList(){
         if(size<2){
             return;
         }
         Node prev=null;
         Node pres=head;
        Node next=pres.next;

         while (pres!=null){

             pres.next=prev;
             prev=pres;
             pres=next;
             if(next!=null){
                 next=next.next;
             }
         }
         head=prev;
    }


    public static void main(String[] args) {
        CustomLinkedlist l=new CustomLinkedlist();
        CustomLinkedlist gt=new CustomLinkedlist();
        l.insertLast(3);
        l.insertLast(4);
        gt.insertLast(4);
        gt.insertLast(45);
        CustomLinkedlist ans=CustomLinkedlist.merge(l,gt);
        ans.dispaly();
        System.out.println(hasCycle(ans));
        System.out.println(countnoofelmentscycle(ans));
        System.out.println(happyno(2));
        Node mid=Middleelement(ans);
        if (mid!=null){
            System.out.println(mid.value);
        }
        ans.dispaly();
        ans.reverseLinkedList();
        ans.dispaly();


    }




}



