package Notes;

public class MethodOverriding {
    public static void main(String[] args) {
        Animal1 A1 = new Animal1();
        A1.eat();

        Dog1 D1 = new Dog1();
        D1.eat();
    }
}

class Animal1{
    public void eat(){
        System.out.println("Can eat");
    }
}

class Dog1{
    public void eat(){
        System.out.println("Dog can eat");
    }
}
