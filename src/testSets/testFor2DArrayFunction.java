package testSets;

import java.util.Scanner;

public class testFor2DArrayFunction {
    public static int[][] arr2d(int a, int b){
        Scanner sc=new Scanner(System.in);
        int [][] arr = new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter number for Raw "+i+" Column "+j);
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static void printarr2d(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Test for 2d Array");
        System.out.println("Enter Raw you want");
        int x=sc.nextInt();
        System.out.println("Enter Column you want");
        int y=sc.nextInt();

        System.out.println("Your Result");
        printarr2d(arr2d(x, y));
    }


}
