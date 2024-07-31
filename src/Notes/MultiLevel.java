package Notes;

public class MultiLevel {
    public static void main(String[] args) {
        System.out.println("Anime Class ----");
        Animal A = new Animal();
        System.out.println(A.type);

        System.out.println("Dog Class ----");
        Dog D = new Dog();
        System.out.println(D.type);
        System.out.println(D.wild);

        System.out.println("Baby Dog Class ----");
        BabyDog BD = new BabyDog();
        System.out.println(BD.type);
        System.out.println(BD.wild);
        System.out.println(BD.canAdopt);

    }
}

class Animal{
        String type = "Ground";
}

class Dog extends Animal{
    boolean wild = true;
}

class BabyDog extends Dog{
    boolean canAdopt = true;
}

