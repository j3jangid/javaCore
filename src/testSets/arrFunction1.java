package testSets;

import java.util.Scanner;

public class arrFunction1 {
    public static int[] buildArr(int x){
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[x];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value at "+(i+1));
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        System.out.println("Your Result");

        for (int j = 0; j < arr.length; j++) {
            System.out.println((j+1)+". "+arr[j]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("test for array method");
        System.out.println("Enter how many Index you want in array");
        int y = sc.nextInt();
        printArr(buildArr(y));

    }
}

