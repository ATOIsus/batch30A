package chapter5Array;

import java.util.Scanner;

public class L_TwelfthProgram {


    public static void multiDimensionArray() {

        int row = 2;
        int column = 2;
        int[][] arr = new int[row][column];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print("Enter data in row " + i + " column " + j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(" ");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        sc.close();

    }


    public static void findEven() {

        int row = 2;
        int column = 2;
        int[][] arr = new int[row][column];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                System.out.print("Enter data in row " + i + " column " + j + " : ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(" ");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.println(arr[i][j] + " is an even number.");
                }
            }
        }

        sc.close();
    }


    public static void addArray() {

        Scanner sc = new Scanner(System.in);

        int row;
        int column;

        System.out.print("Enter number of rows   : ");
        row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        column = sc.nextInt();

        int[][] arr1 = new int[row][column];
        int[][] arr2 = new int[row][column];
        int[][] add = new int[row][column];

        System.out.println(" \nFor array1");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                System.out.print("Enter data in row " + i + " column " + j + " : ");
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nFor array2");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                System.out.print("Enter data in row " + i + " column " + j + " : ");
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println(" ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                add[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("\nThe result is: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(add[i][j] + " ");
            }
        }

        sc.close();

    }


    public static void multiplyArray() {

        Scanner sc = new Scanner(System.in);

        int row;
        int column;
        int row1;
        int column1;

        System.out.print("\nEnter number of rows for matrix 1   : ");
        row = sc.nextInt();

        System.out.print("Enter number of columns for matrix 1: ");
        column = sc.nextInt();

        System.out.print("\nEnter number of rows for matrix 2   : ");
        row1 = sc.nextInt();

        System.out.print("Enter number of columns for matrix 2: ");
        column1 = sc.nextInt();

        if (row1 != column) {
            System.out.println("\nMultiplication Not Possible");
            sc.close();
            return;
        }

        int[][] arr1 = new int[row][column];
        int[][] arr2 = new int[row1][column1];
        int[][] mul = new int[row][column1];

        System.out.println(" \nFor array1");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                System.out.print("Enter data in row " + i + " column " + j + " : ");
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nFor array2");

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                System.out.print("Enter data in row " + i + " column " + j + " : ");
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println(" ");


        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column; j++) {
                for (int k = 0; k < row1; k++)
                    mul[i][j] += arr1[i][k] * arr2[k][j];
            }
        }


        System.out.println("\nThe result is: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(mul[i][j] + " ");
            }
        }


        sc.close();

    }


    public static void main(String[] args) {

        multiplyArray();

        addArray();

        findEven();

        multiDimensionArray();
    }
}
