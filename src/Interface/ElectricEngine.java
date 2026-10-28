package Interface;



public class ElectricEngine implements Engine{
    @Override
    public void start(){
        System.out.println("electic engine start");
    }
    @Override
    public void stop(){
        System.out.println("electic engine stop");
    }
    @Override
    public void acc(){
        System.out.println("electic engine accelerate");
    }







}
