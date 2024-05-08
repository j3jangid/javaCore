package oops;

public class classEx {
    public static void main(String[] args) {
        studentPrint j3 = new studentPrint();
        j3.sr=1;
        j3.firstName="Jatin";
        j3.lastName="Jangid";
        j3.rollNo=420;
        j3.city="Jaipur";

        System.out.println(j3.sr);
        System.out.println(j3.firstName);
        System.out.println(j3.lastName);
        System.out.println(j3.rollNo);
        System.out.println(j3.city);

        studentPrint.hello(j3.firstName);
        j3.mobile();
        j3.hello(j3.lastName);

    }
}

class studentPrint{
    int sr;
    String firstName;
    String lastName;
    int rollNo;
    String city;

    public static void hello(String name) {
        System.out.println("Hello "+name);
    }

    public void mobile() {
        System.out.println("Mobile Phone's are not Allowed");
    }
}
