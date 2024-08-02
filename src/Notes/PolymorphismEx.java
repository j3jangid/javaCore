package Notes;

// Compile time Polymorphism = method overloading
// Run time Polymorphism = method overriding

public class PolymorphismEx {
    public static void main(String[] args) {

        // Up casting to get Elements of A from B
        A a = new B();
        System.out.println(a.color);
        a.methodA();

        // Down casting to get elements of A&B by B
        B b = (B)a;
        System.out.println(b.tail);
        System.out.println(b.color);
        b.methodB();
        b.methodA();

    }
}

class A {
    String color = "Green";
    public void methodA(){
        System.out.println("Method A");
    }
}

class B extends A{
    boolean tail = true;
    public void methodB(){
        System.out.println("Method B");
    }

    public void methodA(){
        System.out.println("Method A from class B");
    }

}
