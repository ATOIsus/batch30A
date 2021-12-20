package chapter1Fundamental;

import java.util.Scanner;

public class A_FirstProgram {

    public static int AddingNumber() {


        Scanner sc = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int result;

        System.out.print("\nEnter first number: ");
        firstNumber = sc.nextInt();

        System.out.print("Enter second number: ");
        secondNumber = sc.nextInt();

        sc.close();

        result = firstNumber + secondNumber;

        return result;

        

    }

    public static void main(String[] args) {


        System.out.println("\nProgram to print sum of two number.");

        int sum = AddingNumber();

        System.out.println("\nThe sum is " + sum);

    }


}
