package MultiThreading;

public class DaemonClass {
    public static void main(String[] args) {
        T t1 = new T();
        T t2 = new T();
        T t3 = new T();

        t1.setDaemon(true);
        t2.start();
        t1.start();
        t3.start();


    }
}

class T extends Thread{
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()) {
            System.out.println("Daemon Thread");
        }else {
            System.out.println("Non Daemon Thread");
        }
    }
}
