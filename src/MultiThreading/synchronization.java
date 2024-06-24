package MultiThreading;

public class synchronization {
    public static void main(String[] args) throws InterruptedException {
        Resou r = new Resou();
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    r.addCount();
                }
            }
        };

        Thread t2 = new Thread(){
            public void run () {
                 for (int i = 0; i < 1000; i++) {
                     r.addCount();
                }
            }
        };

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(r.count);

        Thread t3 = new Thread(){
            public void run(){
                Resou.printTable(2);
            }
        };
        Thread t4 = new Thread(){
            public  void run(){
                Resou.printTable(6);
            }
        };

        t3.start();
        t4.start();


    }
}

class Resou{
    int count;
    public void addCount(){
        synchronized(this){
            count++;
        }
    }

    public synchronized static void printTable(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i*n);
        }
    }
}