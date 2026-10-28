package staticexample;

public class Innerclasses {
    static class Test {//doesnt depend on object of Innerclasses
        String name;

        public Test(String name) {
            this.name = name;
        }
    }
public static void main(String[] ars){
    Test a=new Test("dsf");
    Test b=new Test("sfd");
    System.out.println(a.name);

    System.out.println(b.name);
}
}