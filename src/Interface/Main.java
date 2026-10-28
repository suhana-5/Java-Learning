package Interface;

public class Main {
    public static void main(String[] args) {
     //   Engine car=new Car(); //engine refers to only the members that r declared inside engine class
       // car.a;same reason
        Car cafr=new Car();
        System.out.println(cafr.s);
//        car.acc();
//      //  car.start(); //therefore start is not declaared inside engine
//        car.stop();



        NiceCar car=new NiceCar();
        car.start();
        car.stop();
        car.startMusic();
        car.stopMusic();
        car.upgradeEngine();


    }
}
