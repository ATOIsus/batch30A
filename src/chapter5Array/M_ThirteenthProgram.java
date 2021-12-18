package chapter5Array;

import java.util.Scanner;

public class M_ThirteenthProgram {

    // Not completed.

    public static void binarySearch() {

        Scanner sc = new Scanner(System.in);
        int size;
        int min;
        int max;
        int middle;
        int search;

        System.out.println(" ");

        System.out.print("Enter size of array:  ");
        size = sc.nextInt();

        if (size < 3) {
            System.out.println("Invalid number!");
            return;
        }

        int[] arr = new int[size];

        min = 0;
        max = size - 1;
        middle = (max + min) / 2;

        System.out.println(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter an integer in ascending order" + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("\nEnter number to search: ");
        search = sc.nextInt();

        while (min <= max) {

            if (search == arr[middle]) {
                System.out.println(search + "exist in " + middle + " in the array.");
                break;
            } else if (search > arr[middle]) {
                min = middle + 1;
            } else {
                max = middle - 1;
            }
            middle = (max + min) / 2;
        }


        if (min > max) {
            System.out.println("\nThe item does not exists.");
        }
    }


    // Not completed.

    public static void bubbleSort() {

        Scanner sc = new Scanner(System.in);
        int size;
        int index;


        System.out.println(" ");

        System.out.print("Enter size of array:  ");
        size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter an integer" + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("\nBefore array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    index = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = index;
                }

            }
        }

        System.out.println("\nAfter array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {


        binarySearch();

        bubbleSort();

    }


}
