package MultiThreading;

public class InterThread {
    public static void main(String[] args) {
        Resour r = new Resour();
        Producer p = new Producer(r);
        Consumer c = new Consumer(r);
    }
}


class Resour{
    int count;
    boolean value = false;

    public synchronized void put(int count){
        while (value){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.count = count;
        System.out.println("Put "+this.count);
        value=true;
        notify();
    }

    public synchronized void get(){
        while (!value){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Get "+this.count);
        value=false;
    }
}

class Producer implements Runnable{
    Resour r;
    public Producer(Resour r){
        this.r=r;
        Thread t = new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        int i=1;
        while (true){
            r.put(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable{
    Resour r;
    public Consumer(Resour r){
        this.r=r;
        Thread t = new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        int i=1;
        while (true){
            r.get();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}