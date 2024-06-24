package exceptionHandlingClass;

import java.io.IOException;

public class ExceptionThrows {
    public static void main(String[] args) throws IOException {
        A a = new A();
        a.a();

        B b = new B ();
        b.a();

    }
}

class A {
    void a() throws ArithmeticException{
        System.out.println("A");
    }
}

class B extends A{
    void a() {
        System.out.println("b");
    }
}
