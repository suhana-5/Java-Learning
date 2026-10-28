package staticexample;

public class Main {
    public static void main(String[] args) {
        Human suhana=new Human(21,"suhana r shetty",10000000,false);
        System.out.println(suhana.maried);
        System.out.println(suhana.population);
        Human arpit=new Human(21,"suhana r shetty",10000000,false);
        System.out.println(suhana.population);
        System.out.println(Human.population);//right convention to use static
    }
}
