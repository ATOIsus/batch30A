package chapter5Array;

import java.util.Scanner;

public class K_EleventhProgram {

    public static void arrayFun() {

        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter an integer " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println(" ");

        for (int j : arr) {
            if (j % 2 == 0) {
                even++;
                System.out.println("Even: " + j);
            } else {
                odd++;
                System.out.println("Odd: " + j);
            }
        }

        System.out.println("No. of odd  is " + odd);
        System.out.println("No. of even is " + even);


        sc.close();

    }


    public static void arrayVariable() {

        Scanner sc = new Scanner(System.in);
        int size;
        int search;
        boolean found = false;

        System.out.println(" ");

        System.out.print("Enter size of array:  ");
        size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter an integer " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println(" ");

        System.out.print("Enter the number to search : ");
        search = sc.nextInt();

        for (int j : arr) {
            if (j == search) {
                found = true;
                break;
            }
        }

        System.out.println(" ");

        if (found) {
            System.out.println(search + " exists in the array.");
        } else {
            System.out.println(search + " does not exists in the array.");
        }


        sc.close();


    }

    public static void arrayMaxMin() {

        Scanner sc = new Scanner(System.in);
        int size;


        System.out.println(" ");

        System.out.print("Enter size of array:  ");
        size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter an integer " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        int maxNum = arr[0];
        int minNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }

        System.out.println(" ");
        System.out.println(maxNum + " is maximum number. ");
        System.out.println(minNum + " is minimum number. ");


        sc.close();

    }


    public static void arraySecondSmallest() {

        Scanner sc = new Scanner(System.in);
        int size;
        int index = 0;
        int smallestNum;
        int minNum;


        System.out.println(" ");

        System.out.print("Enter size of array:  ");
        size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter an integer " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        smallestNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallestNum) {
                smallestNum = arr[i];
                index = i;
            }
        }

        if(index < size -1) {
            minNum = arr[index + 1];
        }else{
            minNum = arr[index -1];
        }

        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                if (arr[i] < minNum) {
                    minNum = arr[i];
                }
            }
        }

        System.out.println(" ");
        System.out.println(minNum + " is the second smallest. ");


        sc.close();

    }


    public static void main(String[] args) {

        arraySecondSmallest();

        // arrayMaxMin();

        // arrayVariable();

        // arrayFun();
    }

}
