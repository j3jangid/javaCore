package exceptionHandlingClass;

public class ExceptionPro {
    public static void main(String[] args) {
        A1 a = new A1();
        a.c();

        System.out.println("Compleated");

    }
}

class A1{
    void a(){
        int a = 10/0;
    }

    void b (){
        a();
    }

    void c(){
        try {
            b();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
