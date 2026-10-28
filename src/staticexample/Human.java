package staticexample;

public class Human {
    int age;        //instance variable
    String name;
    int salary;
    boolean maried;
    static long population;


    public Human(int age,String name,int salary,boolean maried){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.maried=maried;
        Human.population+=1;
    }
}
//first population is checked in objects then class template;