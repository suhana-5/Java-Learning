package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        List<Integer> list2=new LinkedList<>();
       list.add(40);
        System.out.println(list);
        list2.add(30);
        list2.add(44);
        list2.add(50);

        System.out.println(list2);

        List<Integer> vector=new Vector<>();
        vector.add(30);
        vector.add(40);
        System.out.println(vector);
    }
}
//arraylist is asyncrosnized vector is single threasded synchnorized but vector is slow;