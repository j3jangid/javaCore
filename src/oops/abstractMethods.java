package oops;

public class abstractMethods {
    public static void main(String[] args) {
        cars c = new Honda();
        c.make();
        c.speed();

        Honda h = new Honda();
        System.out.println("details from Honda");
        h.make();
        h.speed();
        h.type();
    }
}

abstract class cars{
    abstract public void make();

    public void speed(){
        System.out.println("Depends on maker");
    }
}

class Honda extends cars{
    public void make(){
        System.out.println("This is Honda");
    }
    public void speed(){
        System.out.println("140kmph");
    }

    public void type(){
        System.out.println("This is Sedan");
    }
}