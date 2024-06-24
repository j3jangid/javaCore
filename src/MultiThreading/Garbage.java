package MultiThreading;

public class Garbage {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Collected");
    }

    public static void main(String[] args) {
        Garbage g1 = new Garbage();
        g1=null;
        new Garbage();
        Garbage g2 = new Garbage();
        g2 = null;
        System.gc();
    }
}
