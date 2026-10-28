package Inheritence;

public class Mainbox {
    public static void main(String[] args) {
//        Box box=new Box(4,4,4);
//        Box Box2=new Box(box);
//
//        System.out.println(box.l+" "+box.h+" "+box.w);
        Boxweight box=new Boxweight();//ref child to child

        System.out.println(box.l+" "+box.w+" "+box.h+" "+box.weight);
       Boxweight box2=new Boxweight(3,4,5,6);
        System.out.println(box2.l+" "+box2.w+" "+box2.h+" "+box2.weight);

//        Box box2=new Boxweight(3,4,5,3);//only acces to super class object;
//        System.out.println(box2.weight);
  //      Boxweight box=new Box(4,3,3,3);//ref to child to a parent
        //many car in both child n parant class;
        // u r gicen access to var that r in ref type ie Boxweight;
        // u are hvg only access to weigh variaable;
        //if u r trying to acces should be initialize;
        // but here obj itself is a type of parent class how will u call that
    Boxprice boxp=new Boxprice(4,4,5,4,4);
        System.out.println(boxp.l+" "+boxp.w+" "+boxp.h+" "+boxp.weight+" "+boxp.cost);
    }
}
