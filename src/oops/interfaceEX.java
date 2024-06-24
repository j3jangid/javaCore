package oops;

public class interfaceEX {
    public static void main(String[] args) {
        // referance of static as per blow methoid in IPS Class
        IPS.mentor();

        school s = new IPS();
        s.room();
        System.out.println(s.upto);;

        IPS i = new IPS();
        System.out.println(i.maxStudents);;
        i.room();
        i.mentor();


    }
}

interface school{
    void room();
    int upto = 12;
}

// use implenents insted of extends if using interface.
class IPS implements school{
    public void room(){
        System.out.println(50);
    }

    int maxStudents = 20;

    // use Static to get deta directly by class name without creating class object. check in PSVM
    public static void mentor(){
        System.out.println("Jatin");
    }
}