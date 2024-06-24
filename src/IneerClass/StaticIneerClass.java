package IneerClass;

public class StaticIneerClass {
    public static void main(String[] args) {
        A2.B2 c = new A2.B2();
        c.mass();
    }
}

class A2 {
    private static  int id = 123;
    static class B2{
        public void mass(){
            System.out.println("Static Class "+id);
        }
    }
}
