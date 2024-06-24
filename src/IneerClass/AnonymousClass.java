package IneerClass;

public class AnonymousClass {
    public static void main(String[] args) {
        A1 a = new A1(){
            public void greet(){
                System.out.println("Hello");
            };
        };

        a.greet();

        B1 b = new B1(){
            public void hello(){
                System.out.println("hello");
            }
        };
        b.hello();

    }
}

abstract class A1 {
    public abstract void greet();
}

interface B1{
    void hello();
}
