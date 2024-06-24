package IneerClass;

public class MemberIneerClass {
    public static void main(String[] args) {
        AOuter ao = new AOuter();
        AOuter.AIneer ai = ao.new AIneer();
        ai.AIPrint();
    }
}

class AOuter{
    private int age = 18;

    class AIneer{
        void AIPrint(){
            System.out.println("A Ineer Print "+age);
        }
    }
}
