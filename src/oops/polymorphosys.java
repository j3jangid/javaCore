package oops;

public class polymorphosys {
    public static void main(String[] args) {
        A1 a = new A1();
        System.out.println(a.add(4,5));
        System.out.println(a.add(4.5f,5.5f));
        System.out.println(a.add(4,5,6));
        a.xyz();

        System.out.println("contant from class b");
        B1 b = new B1();
        System.out.println(b.add(4,5));
        System.out.println(b.add(4.5f,5.5f));
        System.out.println(b.add(4,5,6));
        b.xyz();

    }
}
// two types of polymorphysis 1. complile time, 2. run time
class A1{
    int add(int a, int b){
        return a+b;
    }

    float add (float a, float b){
        return a+b;
    }

    int add(int a, int b,int c){
        return a+b+c;
    }

    void xyz (){
        System.out.println("xyz in A1");
    }
}

//run time (xyz is also available in class A1)
class B1 extends A1{
    void xyz() {
        System.out.println("xyz from B1");
    }
}
