import java.util.Scanner;

public class J_TenthProgram {

    public static void main(String[] args){


        for(int i = 0; i < 3; i++){
        checkPalindrom();
        }

        takeInput();


    }



    public static void takeInput(){

        Scanner sc = new Scanner(System.in);


        int first;
        int second;
        int third;

        System.out.println(" ");
        System.out.print("Enter first Number : ");
        first = sc.nextInt();

        System.out.print("Enter second Number: ");
        second = sc.nextInt();

        System.out.print("Enter third Number : ");
        third = sc.nextInt();
        System.out.println(" ");

        addNum(first,second,third);

        simpleInterest(first, second, third);

        highestNumber(first, second, third);
    }


    public static void addNum(int first, int second, int third){
        int sum = first + second + third;
        System.out.println("Sum is " + sum);
        System.out.println(" ");
    }


    public static void simpleInterest(int first, int second, int third){
        System.out.println("The simple interest is " + (first * second * third) / 100);
        System.out.println(" ");
    }

    public static void highestNumber(int first, int second, int third){

        int highest;

        if (first > second && first > third){
            highest = first;
        }else if(second > first && second > third){
            highest = second;
        }else{
            highest = third;
        }

        System.out.println("The highest is " + highest);
        System.out.println(" ");

    }


    public static void checkPalindrom(){

        Scanner sc = new Scanner(System.in);

        int palindrom = 0;
        int userInput;
        int rem;

        System.out.println(" ");
        System.out.print("Enter a number: ");
        userInput = sc.nextInt();

        int originalInput = userInput;

        while(userInput > 0){
            rem = userInput % 10;
            palindrom = palindrom * 10 + rem;
            userInput = userInput/10;
        }

        System.out.println(palindrom);

        if (originalInput == palindrom) {
            System.out.println("The number is a palindrom.");
        }else{
            System.out.println("The number is not a palindrom.");
        }
        System.out.println(" ");
    }
}
