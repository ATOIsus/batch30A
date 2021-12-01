import java.util.Scanner;

public class F_SixthProgram {


    public static void switchCase(){
        int number;

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number: ");
        number = sc.nextInt();


        switch (number){
            case 1:
                System.out.println("No ");
                break;
            case 2:
                System.out.println("No ");
                break;
            case 4:
                System.out.println("No");
                break;
            case 3:
                System.out.println("No");
                break;
            case 5:
                System.out.println("Yes");
                break;

            default:
                System.out.println("Not between 1 and 5");
        }
    }

    public static void menuDrivenProgram(){

        int userInput;
        float userInputAdd1;
        float userInputAdd2;
        float sum;

        Scanner sc = new Scanner(System.in);

        System.out.println("The choice are: ");
        System.out.println("               1) Add two numbers.  ");
        System.out.println("               2) Simple Interest.  ");
        System.out.println("               3) Palindrom Number.");
        System.out.println("               4) Odd Even");
        System.out.println(" ");

        System.out.print("Enter your choice: ");
        userInput = sc.nextInt();

        switch(userInput){

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

                System.out.print("Enter time: ");
                time = sc.nextFloat();

                System.out.print("Enter rate: ");
                rate = sc.nextFloat();

                simpleInterest = (principle * time * rate) / 100;

                System.out.println("The simple interest of " + principle + " at time " + time + "with rate " + rate + " is " + simpleInterest);

                break;

            case 3:

                int userInputPal;
                int lastDigit;
                int firstDigit;
                int palindrom;


                System.out.println(" ");
                System.out.print("Enter a number: ");
                userInputPal = sc.nextInt();

                lastDigit  = userInputPal % 10;
                firstDigit = userInputPal / 10;

                palindrom = lastDigit * 10 + firstDigit;

                if (userInputPal == palindrom){
                    System.out.println("The number " + userInputPal + " is a palindrom.");
                }else{
                    System.out.println("The number " + userInputPal + " is not a palindrom.");
                }
                break;

            case 4:

                float userInputOdd;

                System.out.println(" ");
                System.out.print("Enter first number: ");
                userInputOdd = sc.nextFloat();

                if (userInputOdd % 2 == 0){
                    System.out.println("The number " + userInputOdd + " is an even number.");
                }else{
                    System.out.println("The number " + userInputOdd + " is not an even number.");
                }
                break;

            default:
                System.out.println("Incorrect number");

        }
    }


    public static void main(String[] args){

        System.out.println(" ");
        switchCase();

        System.out.println(" ");
        menuDrivenProgram();
        System.out.println(" ");

    }


}
