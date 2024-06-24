package Strings;

public class stringClass {
    public static void main(String[] args) {
        String s1 = "Jatin";
        String s2 = "Jatin";
        String s3 = new String("Jatin");

        System.out.println(s1==s2);
        System.out.println(s1==s3);

        // String Buffer
        System.out.println("String Buffer Example");

        // Mutable String with new Value

        StringBuffer sb = new StringBuffer("Hello");
        sb.append("world");
        System.out.println(sb);

        sb.insert(2, "ABC");
        System.out.println(sb);

        sb.replace(2, 4, "ABC");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.charAt(3));


        // String Builder
        System.out.println("String Builder Example");

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append("World");
        System.out.println(sb1);

        sb1.insert(2, "ABC");
        System.out.println(sb1);

        sb1.replace(5,8, "XYZ");
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);

        System.out.println(sb1.charAt(5));

        String s4 = "Jatin";
        String s5 = new String("Jatin");
        String s6 = "jatin";
        String s7 = "Jangid";

        // equals and ingore case
        s2.equalsIgnoreCase(s3);

        System.out.println("Equals Case Check : "+s4.equals(s5));
        System.out.println("Equals Case Check : "+s4.equals(s6));
        System.out.println("Equals Ignore Case Check : "+s4.equalsIgnoreCase(s6));




        //compare string (return value in int if same the 0 otherwise value will be positive or nagative)
        s2.compareTo(s3);

        System.out.println("Compare Case Check : "+s4.compareTo(s5));
        System.out.println("Compare Case Check : "+s4.compareTo(s6));
        System.out.println("Compare Case Check : "+s4.compareTo(s7));
        System.out.println("Compare Ignore Case Check : "+s4.compareToIgnoreCase(s6));












    }
}
