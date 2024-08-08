package Notes;

// Hiding code from end user. (hiding implementation details)
// keep it as simple as for the end user.
//how we can achieve abstraction in java,
        //By using abstraction class(0-100%)
        //by using Interface(pure 100%)

//Abstract Method => method that done not contain any code is abstract method. Ex- (public void say();)
    //if any class contain any abstract method then we need to add abstract key word to class as well.

//abstract class ClassA{
//    public abstract void method();
//}

// we cant create object of abstract class.
// In abstract class we can have abstract & Non-abstract method.
// Abstract class can have constructor or multiple constructor.

abstract class AbstractEx{
    public AbstractEx(){
        System.out.println("non pera constructor");
    }
    public AbstractEx(String name){
        System.out.println("pera const");
    }
    public abstract void say();
    public void display(){
        System.out.println("display Method");
    }
}

// how we will use abstract class.
    // by using Inheritance.


public class AbstractionEx {
    public static void main(String[] args) {

    }
}


