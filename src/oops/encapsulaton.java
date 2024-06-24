package oops;

public class encapsulaton {
    public static void main(String[] args) {
        student s = new student();
        s.setAge(120);
        System.out.println(s.getAge());
    }
}

class student{
    private String name;
    private int age;
    private int rollNo;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

}
