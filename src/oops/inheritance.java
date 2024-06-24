package oops;

public class inheritance {
    public static void main(String[] args) {
        parent p = new parent();
        p.lName = "Jangid";
        p.number= 34234;
        child c = new child();
        c.fName = "Jatin";
        c.age = 45;
        child2 c2 = new child2();
        c2.fName = "Jack";
        c2.age = 76;
        gChild1 gc1 = new gChild1();
        gc1.fName = "kjhgfd";
        gc1.age = 25;
        gc1.likes = "apple";
        gChild2 gc2 = new gChild2();
        gc2.fName = "asdfg";
        gc2.age = 22;
        gc2.likes = "RTX3090TI";


        System.out.println("Parent & Child");
        System.out.println(c.fName +" "+ p.lName + ". his age is "+ c.age+" & Number is "+ p.number);

        System.out.println("Parent & Child & G.Child");
        System.out.println(gc1.fName +" "+p.lName+" his age is "+gc1.age+" his fathers name is "+ c.fName);

        p.classNames1();
        c.classNames1();
        gc1.classNames1();

    }



}

class parent{
    String lName;
    int number;
    void classNames1(){
        System.out.println("Parent Class");
    }
}

class child extends parent{
    String fName;
    int age;
    void classNames123(){
        System.out.println("Child 1 in Parent");
    }
}

class child2 extends parent{
    String fName;
    int age;
    void className(){
        System.out.println("Child 2 in Parent class");
    }
}

class gChild1 extends child{
    String fName;
    int age;
    String likes;
}

class gChild2 extends child2{
    String fName;
    int age;
    String likes;
}