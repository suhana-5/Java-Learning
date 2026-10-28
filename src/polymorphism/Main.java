package polymorphism;
import access.A;
public class Main {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle circle=new Circle();
     //   Square square=new Square();
        Shapes square=new Square();//access to object type of obj is accessed
      A a=new A(3,"af");

        System.out.println(a.getNum()); //when datamember is private

        circle.area();
    }
}
