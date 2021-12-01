import java.util.Scanner;

public class A_FirstProgram {

    public static int AddingNumber(){


        Scanner sc = new Scanner(System.in);

        int firstNumber;
        int secondNumber;
        int result;

        System.out.print("Enter first number: ");
        firstNumber = sc.nextInt();

        System.out.print("Enter second number: ");
        secondNumber = sc.nextInt();

        result = firstNumber + secondNumber;

        return result;

    }

    public static void main(String[] args){


        System.out.println("Program to print sum of two number.");

        int sum = AddingNumber();

        System.out.println("The sum is " + sum);

    }


}
