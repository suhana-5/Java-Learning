package Inheritence;

public class Boxweight  extends Box{
    double weight;

      Boxweight(){
        this.weight=8;
    }
         Boxweight(Boxweight other){
          super(other);
          weight=other.weight;
         }
         Boxweight(double side, double weight){
          super(side);
          this.weight=weight;
         }





    Boxweight(double h,double w,double l,double weight){
          super(h,w,l);//used to call parent clas constructor
        //used to initialize value prst in parent class;
        //super used as this
        //it refers explictly smtg that is in parent class
        System.out.println(super.w);
        System.out.println(this.w);
          this.weight=weight;
          //  super(h,w,l);//first initialion of parent class
    }
}
