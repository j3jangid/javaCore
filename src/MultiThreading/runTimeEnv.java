package MultiThreading;

import java.io.IOException;

public class runTimeEnv {
    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();
        System.out.println(r);
        r.exec("notepad");
        System.out.println(r.freeMemory());
    }
}
