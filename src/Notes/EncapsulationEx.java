package Notes;

// Binding Data and Code together. (instance variable & methods)
//data hiding with private access modifier
// to get and set values we will use getter and setter method.

public class EncapsulationEx {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setFee(20000);
        s1.setName("Jatin");
        s1.setId(101);

        System.out.print("Id : ");
        System.out.println(s1.getId());
        System.out.print("Name : ");
        System.out.println(s1.getName());
        System.out.print("Fee : ");
        System.out.println(s1.getFee());

        System.out.println(s1);

    }
}

class Student{
    private int id;
    private String name;
    private float fee;

    public void setId(int id){
        this.id=id;
    }

    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setFee(float fee){
        this.fee= fee;
    }

    public float getFee(){
        return this.fee;
    }

    @Override
    public String toString() {
        return id + name + fee;
    }
}
