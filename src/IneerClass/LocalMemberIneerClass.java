package IneerClass;

public class LocalMemberIneerClass {
    public static void main(String[] args) {
        A a = new A();
        a.met();
    }
}

class A{
    private int age = 18;
    public void met(){
        class B{
            void print(){
                System.out.println("in outer method class "+age);
            }
        }
    B b = new B();
    b.print();
    }
}
