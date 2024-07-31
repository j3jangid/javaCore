package collection;

import java.util.ArrayList;
import java.util.stream.Stream;

public class FilterMapStremeObject {
    public static void main(String[] args) {
        Student2 S1 = new Student2("Jatin", 101, 10000.0f);
        Student2 S2 = new Student2("J3", 102, 11000.0f);
        Student2 S3 = new Student2("Jangid", 103, 12000.0f);
        Student2 S4 = new Student2("Hari", 104, 13000.0f);
        Student2 S5 = new Student2("OM", 105, 14000.0f);

        Student2[] StudentArray = {S1, S2, S3, S4, S5};

        for (Student2 s:StudentArray){
            s.print();
        }

        ArrayList<Student2> al = new ArrayList<>();

        for (Student2 s:StudentArray){
            al.add(s);
        }

        System.out.println(al);

        Stream<Student2> stream = al.stream();

        Stream<Student2> mapStream = stream.map(e-> {
            e.fee=e.fee+100;
            return e;
        });


    }
}

class Student2{
    String name;
    int rollNo;
    float fee;
    public Student2(String name, int rollNo, float fee){
        this.name=name;
        this.rollNo=rollNo;
        this.fee=fee;
    }

    public void print(){
        System.out.println(rollNo+" "+fee+" "+name);
    }
}
