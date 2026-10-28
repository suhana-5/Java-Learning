package access;

public class Objectdemo {
    int num;
    float gpa;
    @Override
    public String toString(){
        return super.toString();//repr of strings
    }
    @Override
    protected void finalize() throws Throwable{
        super.finalize();//when garbage collection hits
    }
   public Objectdemo(int num,float gpa){
       this.num=num;
       this.gpa=gpa;
   }
   public boolean equals(Object obj){
        return this.num==((Objectdemo)obj).num;
   }
   @Override
    public int hashCode(){//a no repr of obj
        return super.hashCode();
   }
   @Override
   protected Object clone() throws CloneNotSupportedException{
        return super.clone();
   }

    public static void main(String[] args) {
//        Objectdemo ob=new Objectdemo(34);
//        Objectdemo obg=new Objectdemo(34);
//        System.out.println(ob.hashCode());
//        System.out.println(obg.hashCode());
        Objectdemo o=new Objectdemo(45,55.4f);
        Objectdemo j=new Objectdemo(45,55.4f);
       if(o==j){
           System.out.println("it checks the address");
       }
       if(o.equals(j)){
           System.out.println("it checks the content");
       }

        System.out.println(o.getClass());

    }

}
