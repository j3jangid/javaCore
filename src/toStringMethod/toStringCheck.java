package toStringMethod;

import javax.xml.bind.annotation.XmlType;

public class toStringCheck {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Jatin");
        System.out.println(s1);
        System.out.println(s1.name);
        System.out.println(s1.rollNo);

    }
}

class Student{
    int rollNo;
    String name;

    Student (int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString() {
        return "rollNo: "+ rollNo+" and Name: "+name;
    }

    void details(){
        System.out.println("Student Name : "+ name+" and Roll No : "+rollNo);
    }
}
