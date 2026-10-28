package staticexample;
//intializaton of static
public class Staticblock {
    static int a=4;
    static int b;

    //will only run once when the first obj is created;ie when the class is loaderd for 1st time
    static {
        System.out.println("i ma in static bolowck");
        b=a*5;
    }

    public static void main(String[] args) {
        Staticblock obj=new Staticblock();
        System.out.println(Staticblock.a+" "+Staticblock.b);

        Staticblock.b+=4;
        System.out.println(Staticblock.a+" "+Staticblock.b);
        Staticblock obj2=new Staticblock();
        System.out.println(Staticblock.a +" " +Staticblock.b);
    }
}
