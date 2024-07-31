package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class StremeApiEx {
    public static void main(String[] args) {
//		(ArrayList<Integer>)Arrays.asList(new Integer[]{12,34,23,45});
        ArrayList<Integer> list=new ArrayList<Integer>() {} ;
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        Stream<Integer> stream=list.stream();
        Stream<Integer> stream4=list.stream();
        Integer i= stream4.reduce((val1,value)->{
            return val1+value;
        }).get();
        System.out.println(i);


        Stream<Integer> stream2= stream.filter(value->{
                    if(value>=5) {
                        return true;
                    }
                    return false;
                }
        );
        Stream<Integer> finalStream= stream2.map(value->value*2);
        List<Integer> newList =finalStream.toList();
        System.out.println(newList);
    }
}
class Xyz{
    public void xyx() {
        int a=10;
        if(a==4) {
            return;
        }
        System.out.println("dmfijid");

    }
}
