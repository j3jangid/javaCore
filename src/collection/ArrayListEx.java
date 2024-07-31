package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(10);
        ar.add("Jatin");
        ar.add(true);
        ar.add('j');
        ar.add(10.01);

        System.out.println("For Loop");
        for (int i = 0; i <= 4; i++) {
            System.out.println(ar.get(i));
            ar.get(i);
        }

        System.out.println("For Each Loop With Var");

        for (var i : ar ){
            System.out.println(i);
        }

        System.out.println("For Each loop with Object");
        for (Object i : ar){
            System.out.println(i);
        }

        System.out.println("Iterator");
        Iterator ir = ar.iterator();
        while (ir.hasNext()){
            Object ob = ir.next();
            System.out.println(ob);
        }

        System.out.println("Array List int");
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        for (int i : al){
            System.out.println(i);
        }

        var i= 20;

    }

}
