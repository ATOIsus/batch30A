import java.util.Scanner;

public class M_ThirteenthProgram {


    public static int binarySearch() {

        Scanner sc = new Scanner(System.in);
        int size;
        boolean notFound = true;
        int min;
        int max;
        int middle;
        int search;
        int index = 0;


        System.out.println(" ");

        System.out.print("Enter size of array:  ");
        size = sc.nextInt();

        int[] arr = new int[size];

        min = 0;
        max = size - 1;

        System.out.println(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter an integer in ascending order" + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("\nEnter number to search: ");
        search = sc.nextInt();

        while (notFound) {

            middle = (max - min) / 2;
            System.out.println(arr[middle]);
            System.out.println(arr[min]);
            System.out.println(arr[max]);
            if (search == arr[middle]) {
                index = middle;
                notFound = false;
                break;
            }else if (search > arr[middle]) {
                min = middle;
            } else if (search < arr[middle]) {
                max = middle;
            }

        }

        int in = index;

        if (!notFound) {
            return in;
        } else {
            System.out.println(search + " does  not exist in the array.");
            return 0;
        }

    }


    public static int bubbleSort() {

        Scanner sc = new Scanner(System.in);
        int size;
        boolean notFound = true;
        int min;
        int max;
        int middle;
        int search;
        int index = 0;


        System.out.println(" ");

        System.out.print("Enter size of array:  ");
        size = sc.nextInt();

        int[] arr = new int[size];

        min = 0;
        max = size - 1;

        System.out.println(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter an integer in ascending order" + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("\nEnter number to search: ");
        search = sc.nextInt();

        while (notFound) {

            middle = (max - min) / 2;
            System.out.println(arr[middle]);
            System.out.println(arr[min]);
            System.out.println(arr[max]);
            if (search == arr[middle]) {
                index = middle;
                notFound = false;
                break;
            }else if (search > arr[middle]) {
                min = middle;
            } else if (search < arr[middle]) {
                max = middle;
            }

        }

        int in = index;

        if (!notFound) {
            return in;
        } else {
            System.out.println(search + " does  not exist in the array.");
            return 0;
        }

    }


    public static void main(String[] args) {


        int result = binarySearch();

        System.out.println(result);


    }


}
