package AbstractDemo;

public abstract class Parent {
    int age;

    static void hello(){
        System.out.println("this is static method in abstract class");
    }
    void normal(){
        System.out.println("i am normal method");
    }
    abstract void career();
    abstract void partner();
}

