package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayList2Test {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> newArrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            newArrayList.add(arr[i]);
        }

        System.out.println("After adding Data : " +newArrayList);

        int y = 0;

        for (int i = 0; i < newArrayList.size(); i++) {
            y += newArrayList.get(i);
        }
        System.out.println("Value of y : "+y);

        for (int x : newArrayList){
            System.out.println("By For Each : "+x);
        }

        System.out.println("By Iterator");

        Iterator it = newArrayList.iterator();
        while (it.hasNext()){
            var a = it.next();
            System.out.println("By Iterator : "+a);
        }

        System.out.println("For Each Remaining");
        Iterator newIT = newArrayList.iterator();
        newIT.forEachRemaining(System.out::println);

        List<Integer> newAl =(List<Integer>)Arrays.asList(arr);
        System.out.println("By List : "+newAl);

        ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
        System.out.println("By ArrayList : "+al);

    }
}
