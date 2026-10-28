package AbstractDemo;

public class Daughter extends Parent{
    public Daughter(int age){
        this.age=age;
    }

    @Override
    void career(){
        System.out.println("i am coderr");

    }
    @Override
    void partner(){
        System.out.println("i love iron man");
    }
}
