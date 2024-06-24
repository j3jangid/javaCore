package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class threadPool {
    public static void main(String[] args) {
        ExecutorService excutor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            excutor.execute(new Th(""+i));
        }
        excutor.shutdown();
        while (!excutor.isTerminated()){}
        System.out.println("Compleated");
    }
}

class Th implements Runnable{
    String msg;
    public Th(String msg) {
        this.msg=msg;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start "+ msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" End "+ msg);
    }
}
