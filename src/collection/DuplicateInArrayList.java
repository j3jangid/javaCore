package collection;

import java.util.HashSet;
import java.util.Objects;

public class DuplicateInArrayList {
    public static void main(String[] args) {
//			ArrayList<Student> al=new ArrayList<Student>();
//			al.add(new Student(2,"jai",323434.4f));
////			al.add(new Student(102,"Ram",343434.4f));
////			al.add(new Student(103,"Kishan",4434.4f));
////			al.add(new Student(105,"Sita ",323434.4f));
//			al.add(new Student(2,"jai",323434.4f));
//			System.out.println(al);
        HashSet<StudentEX> set=new HashSet<StudentEX>();
        set.add(new StudentEX(2,"jai",323434.4f));
        set.add(new StudentEX(2,"jai",323434.4f));
        System.out.println(set);

        HashSet<Integer> a=new HashSet<Integer>();
        a.add(1);
        a.add(2);
        a.add(5);
        a.add(8);
        a.add(5);
        HashSet<Integer> b=new HashSet<Integer>();
        b.add(2);
        b.add(4);
        b.add(54);
        b.add(84);
        b.add(54);
//			B.retainAll(a);

//        int[] arr1 = {};
//        arr1[0]=1212;
//        System.out.println(arr1[3]);





    }
}

class Student {
    int id;
    String name;
    float fee;
    public Student(int id, String name, float fee) {
        System.out.println("Constructor with args");
        this.id = id;
        this.name = name;
        this.fee = fee;
    }
    Object ob=new Object();
    public Student() {

        System.out.println("constructoru withour parameter");
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
//		System.out.println(this);
//		System.out.println(obj);
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        StudentEX student = (StudentEX) obj;
        return id == student.getId();
    }
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "Student Detials is : ID=>"+id+", Name=>"+name+" Fee=>"+fee;
//	}

}
