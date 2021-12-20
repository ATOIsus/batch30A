package chapter3Loop;

import java.util.Scanner;

public class G_SeventhProgram {

    public static void forLoopMenu() {

        int userStarting;
        int userEnding;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting value: ");
        userStarting = sc.nextInt();

        System.out.print("Enter ending value  : ");
        userEnding = sc.nextInt();

        for (int i = userStarting; i <= userEnding; i++) {
            int userInput;
            float userInputAdd1;
            float userInputAdd2;
            float sum;

            System.out.println(" ");
            System.out.println("The choice are: ");
            System.out.println("               1) Add two numbers.  ");
            System.out.println("               2) Simple Interest.  ");
            System.out.println("               3) Palindrom Number.");
            System.out.println("               4) Odd Even");
            System.out.println(" ");

            System.out.print("Enter your choice: ");
            userInput = sc.nextInt();

            switch (userInput) {

                case 1:
                    System.out.println(" ");
                    System.out.print("Enter first number: ");
                    userInputAdd1 = sc.nextFloat();

                    System.out.print("Enter second number: ");
                    userInputAdd2 = sc.nextFloat();

                    sum = userInputAdd1 + userInputAdd2;

                    System.out.println("The sum is " + sum);

                    break;

                case 2:

                    float principle;
                    float time;
                    float rate;
                    float simpleInterest;

                    System.out.println(" ");
                    System.out.print("Enter principle: ");
                    principle = sc.nextFloat();

                    System.out.print("Enter time     : ");
                    time = sc.nextFloat();

                    System.out.print("Enter rate     : ");
                    rate = sc.nextFloat();

                    simpleInterest = (principle * time * rate) / 100;

                    System.out.println("The simple interest of " + principle + " at time " + time + " with rate " + rate + " is " + simpleInterest);

                    break;

                case 3:

                    int userInputPal;
                    int lastDigit;
                    int firstDigit;
                    int palindrom;


                    System.out.println(" ");
                    System.out.print("Enter a number: ");
                    userInputPal = sc.nextInt();

                    lastDigit = userInputPal % 10;
                    firstDigit = userInputPal / 10;

                    palindrom = lastDigit * 10 + firstDigit;

                    if (userInputPal == palindrom) {
                        System.out.println("The number " + userInputPal + " is a palindrom.");
                    } else {
                        System.out.println("The number " + userInputPal + " is not a palindrom.");
                    }
                    break;

                case 4:

                    float userInputOdd;

                    System.out.println(" ");
                    System.out.print("Enter a number: ");
                    userInputOdd = sc.nextFloat();

                    if (userInputOdd % 2 == 0) {
                        System.out.println("The number " + userInputOdd + " is an even number.");
                    } else {
                        System.out.println("The number " + userInputOdd + " is not an even number.");
                    }
                    break;

                default:
                    System.out.println("Incorrect number");

            }

            System.out.println(" ");
            sc.close();

        }
    }

    public static void forLoop() {

        Scanner sc = new Scanner(System.in);

        String userInput;

        System.out.print("Enter starting value: ");
        userInput = sc.nextLine();


        for (int i = 0; i < userInput.length(); i++) {
            System.out.println(userInput.charAt(i));
        }

        sc.close();
    }

    public static void checkString() {

        Scanner sc = new Scanner(System.in);
        boolean isString = false;
        char[] alphabetArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
                'U', 'V', 'W', 'X', 'Y', 'Z'};
        String userInput;

        System.out.print("Enter something: ");
        userInput = sc.nextLine();


        for (int i = 0; i < 52; i++) {

            for (int j = 0; j < userInput.length(); j++) {

                if (userInput.charAt(j) == alphabetArray[i]) {
                    isString = true;
                    break;
                }
            }
        }

        if (!isString) {
            System.out.println(" '" + userInput + "' is a number.");
        } else {
            System.out.println(" '" + userInput + "' is a string.");
        }

        sc.close();

    }


    public static void main(String[] args) {


        checkString();

        // forLoop();

        // forLoopMenu();


    }


}
