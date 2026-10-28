package access;

public class Main {
    public static void main(String[] args) {
        A obj=new A(10,"suhana");
        //access data member
        // modify data members
        System.out.println(obj.getNum()); //when datamember is private
        //since getNum is public

    }
}




