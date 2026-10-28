package Inheritence;

public class Box {
    double h;
    double l;
    double w;

    Box(){
        super();//object class;
        this.h=1;
        this.w=1;
        this.l=1;
    }
    Box(double side){
        this.l=side;
        this.w=side;
        this.h=side;
    }
    Box(double l,double h, double w){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    Box(Box old){
        this.h=old.h;
        this.w=old.w;
        this.l=old.w;
    }
}

