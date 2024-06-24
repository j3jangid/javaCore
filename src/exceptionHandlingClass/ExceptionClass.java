package exceptionHandlingClass;

import java.sql.SQLOutput;

public class ExceptionClass {
    public static void main(String[] args) {
        int a=10, b=2, c;
        String str = null;

        try {
            c = a/b;
            System.out.println(str.length());
        }catch (ArithmeticException e){
            e.printStackTrace();
            e.getMessage();
            System.out.println("Divide Error");
        }catch (NullPointerException e ){
            e.getMessage();
            e.printStackTrace();
            System.out.println("NullPointerException");
        }catch (Exception e){
            e.getMessage();
            e.printStackTrace();
            System.out.println("you can cover all exception by 'Exception' no need to create many catches for every unique Exception type.");
        }finally {
            System.out.println("Final this will always run");
        }

        System.out.println("Code compleated");
    }
}
