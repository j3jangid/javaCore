package MultiThreading;

public class ThreadsClass {
    public static void main(String[] args) throws InterruptedException {
        Workable w1 = new Workable();
        Workable w2 = new Workable();
        w1.setPriority(8);
        w1.setName("w1");
        w2.setName("w2");
        w1.start();
        w2.start();

        w1.join();


        System.out.println(w1.getPriority()+" is w1's Priority");
        System.out.println(Thread.currentThread().getName() + " is name of the cid Method Thread");
    }
}

class Workable extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
