package polymorphism;

public class Circle extends Shapes{

    @Override//this is called annotation to check whether method iss overriden or not
    //this wiill run when obj of circle is create
    //hence it is overiding the parent method
    void area(){
        System.out.println("area is pie*r*r");

    }
}










