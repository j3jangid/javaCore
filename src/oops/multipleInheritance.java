package oops;


// for multiple inheritance we need to use interface and then implement on abstract class (use , to inplemt multiple interfac).
public class multipleInheritance {
    public static void main(String[] args) {
        A a = new D();
        a.a();
        a.b();

        B b = new D();
        b.c();
        b.d();
        b.a();
        b.e();
    }
}

interface A{
    void a();
    void b();
}

interface B{
    void c();
    void d();
    void a();

    // use Default to add body of a method in interface.
    default void e(){
        System.out.println("e");
    }
}

abstract class C implements A,B{
    public void a(){
        System.out.println("a");
    }
}
// interface to abstract class (implements multiple interfaces) to normal class
//body required of every method, that we can add in normal class or abstract class or in interface by using default in method.
class D extends C{
    public void b() {
        System.out.println("b");
    }

    public void c() {
        System.out.println("c");
    }

    public void d() {
        System.out.println("d");
    }
}
