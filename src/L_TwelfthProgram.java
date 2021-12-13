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
        int[][] add  = new int[row][column];

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

    }


    public static void multiplyArray() {

        Scanner sc = new Scanner(System.in);

        int row;
        int column;

        System.out.print("Enter number of rows   : ");
        row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        column = sc.nextInt();

        int[][] arr1 = new int[row][column];
        int[][] arr2 = new int[row][column];
        int[][] add  = new int[row][column];

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


        System.out.println("\nThe result is: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(add[i][j] + " ");
            }
        }

    }


    public static void main(String[] args) {

        multiplyArray();

        addArray();

        findEven();

        multiDimensionArray();
    }
}
