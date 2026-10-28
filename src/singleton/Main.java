package singleton;

public class Main {
    public static void main(String[] args) {
        singleton obj = singleton.getinstance();
        singleton obj2 = singleton.getinstance();

    }

}
//all 3 ref var are ponting to just one obj;
