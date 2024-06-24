package exceptionHandlingClass;

public class ExceptionThrow {
    public static void main(String[] args) {
        int age = 17;
        try {
            if (age < 18) {
                throw new UnderAge();
            }
        }
        catch (UnderAge e){
            System.out.println(e.getMessage());
        }
    }
}

class UnderAge extends Exception{
    public UnderAge(){
        System.out.println("Your are under Age");
    }

    public UnderAge(String msg){
        super(msg);
    }
}
