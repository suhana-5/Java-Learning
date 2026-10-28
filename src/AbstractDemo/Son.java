package AbstractDemo;

public class Son extends Parent {
    public Son(int age){
        this.age=age;
    }
     @Override
     void normal(){
        super.normal();
     }

    @Override
    void career(){
     System.out.println("i am doc");

 }
 @Override
    void partner(){
     System.out.println("i love shinchan");
 }
}

