package oops;

public class instantInitilizarBlock {
    public static void main(String[] args) {
        A2 a = new A2("asdfghj");
        A2 ab = new A2("sdfgh");
    }
}

class A2{
    String id;
    public A2(String id){
        System.out.println("Constructor Invocked");
        this.id=id;
    }
    {
        System.out.println(1234);
        System.out.println("message from IIB");
    }

}
