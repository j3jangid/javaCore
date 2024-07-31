package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        List<StudentEX> students = new ArrayList<>();

        String[] names = {
                "Aarav", "Vivaan", "Aditya", "Vihaan", "Arjun", "Sai", "Reyansh", "Ayaan", "Krishna", "Ishaan",
                "Ananya", "Aadhya", "Diya", "Pihu", "Ira", "Aarohi", "Saanvi", "Prisha", "Riya", "Navya",
                "Nitya", "Anika", "Mira", "Myra", "Sreeja", "Aanya", "Shanaya", "Aisha", "Alisha", "Tanya",
                "Yash", "Rohan", "Arnav", "Rahul", "Karan", "Aman", "Dev", "Aryan", "Kabir", "Manav",
                "Laksh", "Nikhil", "Ritik", "Rudra", "Yuvaan", "Harsh", "Parth", "Dhruv", "Siddharth", "Jay"
        };

        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            int id = i + 1;
            String name = names[i];
            float fee = 10000 + random.nextFloat() * 10000; // Random fee between 10000 and 20000
            students.add(new StudentEX(id, name, fee));
        }
        System.out.println(students);
        Collections.sort(students,new FeeComprator());
        System.out.println(students);
        Collections.sort(students, new NameComprator());
        System.out.println(students);
        Collections.sort(students,new IDComprator());
        System.out.println(students);

    }
}

class FeeComprator implements Comparator<StudentEX>{
    public int compare(StudentEX s1, StudentEX s2) {
        Float fee1=s1.getFee();
        Float fee2=s2.getFee();
        return fee1.compareTo(fee2);
    }

}

class NameComprator implements Comparator<StudentEX>{
    public int compare(StudentEX s1, StudentEX s2){
        String name1 = s1.getName();
        String name2 = s2.getName();
        return name1.compareTo(name2);
    }
}

class IDComprator implements Comparator<StudentEX>{
    public int compare(StudentEX s1, StudentEX s2){
     Integer id1 = s1.getId();
     Integer id2 = s2.getId();
     return id1.compareTo(id2);
    }
}

