package testSets;
import java.util.Arrays;
import java.util.Scanner;

public class test {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Any number (Range: 1 to 9)");
//            int x=sc.nextInt();


            double xyz = 123;

            int xys = 76543;

            double z=xyz+xys;

            System.out.println(xyz+xys);

            char rt = 'h';

            String st = "jjjdjh";

            String abc = st+st;

            System.out.println(rt+st);


//            int i = 0;
//            while (i<2){
//                System.out.println(i);
//                i++;
//            }

            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.println(j+k);
                }System.out.println("inner");

            }


            int[] arr={1, 2, 3, 4, 5, 6, 7};

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            System.out.println(arr.length);

            String asd = "this is a  String.    ah";


            System.out.println(asd.length());

            System.out.println(asd.toUpperCase());

            System.out.println(asd.toLowerCase());

            System.out.println(asd.indexOf("String"));





        }
    }


