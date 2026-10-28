package AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son=new Son(5);
        son.career();

         Daughter dou=new Daughter(4);
         dou.career();
         dou.partner();

         Parent.hello();//static method
         son.normal();//normal method

    }
}
