package javaClasses;

import java.util.Scanner;

public class arrClass {
    public static void main(String[] args){
            int arr[]=new int[5];
            arr[0]=1;
            arr[1]=2;
            arr[2]=3;
            arr[3]=4;
            arr[4]=5;

            String arr1[] = {"a for apple", "b for ball", "c for cat" };
//        System.out.println(arr[0]);
//        System.out.println(arr1[0]);

//        for (int i: arr){
//            System.out.println(i);
//        }
//
//        for (String i: arr1){
//            System.out.println(i);
//        }

            Scanner sc= new Scanner(System.in);


//        int arr2[] = new int[5];

//        for (int j = 0; j <arr2.length; j++) {
//            System.out.println("Enter Number at "+j);
//            arr2[j]=sc.nextInt();
//        }
//        for(int i: arr2){
//            System.out.println(i);
//        }

            String arr3 [] = new String[5];

            for (int j = 0; j <arr3.length; j++) {
                System.out.println("Enter Data at "+j);
                arr3[j]=sc.next();
            }

            for(String i: arr3){
                System.out.println(i);
            }

    }
}
