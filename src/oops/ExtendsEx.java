package oops;

public class ExtendsEx {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        System.out.println(d1.color);
        System.out.println(d1.breed);
        d1.meal();
        d1.type();


        Men m1 = new Men();
        System.out.println(m1.type);
        System.out.println(m1.Ride);
        m1.creative();
        m1.gender();

        hp hp1 = new hp(true, true, false, "SSD", "XP50", "12BG", "1TB");
        System.out.println(hp1.display);
        System.out.println(hp1.keyboard);
        System.out.println(hp1.mouse);
        System.out.println(hp1.storageType);
        System.out.println(hp1.model);
        System.out.println(hp1.ram);
        System.out.println(hp1.storage);
        hp1.canWork();

    }

}

class Animal{
    String color = "Black";
    public void meal(){
        System.out.println("Non-Veg");
    }
}

class Dog extends Animal{
    String breed = "pug";
    public void type(){
        System.out.println("Ground Type");
    }
}

class human{
    String type = "Ground Type";
    public void creative() {
        System.out.println("Some Time");
    }
}

class Men extends human{
    Boolean Ride = true;
    public  void gender(){
        System.out.println("This is He");
    }
}

class Women extends human {
    Boolean Ride = false;
    public void gender(){
        System.out.println("This is She");
    }
}


class Laptop{
    boolean display;
    boolean keyboard;
    boolean mouse;
    String storageType;
    public Laptop(boolean display, boolean keyboard, boolean mouse, String storageType){
        this.display=display;
        this.keyboard=keyboard;
        this.mouse=mouse;
        this.storageType=storageType;
    }
}

class hp extends Laptop{
    String model;
    String ram;
    String storage;
    public hp(boolean display, boolean keyboard, boolean mouse, String storageType, String model, String ram, String storage){
        super(display, keyboard, mouse, storageType);
        this.model= model;
        this.ram=ram;
        this.storage=storage;
    }

    public void canWork(){
        System.out.println("This can work");
    }
}

