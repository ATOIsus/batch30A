import java.util.Scanner;

public class H_EighthProgram {


    public static void checkPalindrom(){

        Scanner sc = new Scanner(System.in);

        int palindrom = 0;
        int userInput;
        int rem;

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
    }


    public static void switchFirstLastFun(){

        Scanner sc = new Scanner(System.in);

        int palindrom = 0;
        int userInput;
        int rem;

        System.out.print("Enter a number: ");
        userInput = sc.nextInt();

        int originalNum = userInput;


        int count = 0;

        while(userInput > 0){
            rem = userInput % 10;
            palindrom = palindrom * 10 + rem;
            userInput = userInput/10;
            count += 1;
        }

        int withoutFirstNum = originalNum / 10;
        int lastNum = palindrom % 10;
        int middleNum = (int) (withoutFirstNum % Math.pow(10,count -2));


        int firstNum = (int) (palindrom / Math.pow(10,count-1));

        int a = (int) (firstNum * Math.pow(10,count-1));

        int b = middleNum * 10 + lastNum;
        int reversedNum = (int) (  a + b);

        System.out.println(reversedNum);



    }


    public static void switchFirstLast(){

        Scanner sc = new Scanner(System.in);

        int userInput;
        int firstNum = 0;
        int withoutFirstNum =0;

        System.out.print("Enter a number: ");
        userInput = sc.nextInt();

        int originalInput = userInput;

        int countter = 0;
        int pow = 1;

        while(userInput > 0){
            userInput = userInput/10;
            countter += 1;
            pow = pow * 10;
        }

        int count = countter -1;
        firstNum = originalInput;
        while(count > 0) {
            firstNum = firstNum / 10;
            count--;
        }

        withoutFirstNum = originalInput;

        int pow1 = pow /10;
        withoutFirstNum = withoutFirstNum % pow1;

        int lastNum = originalInput % 10;

        int middleNum = withoutFirstNum - lastNum;

        count = countter -1;
        while(count > 0) {
            lastNum *= 10;
            count--;
        }

        int reversedNum =  lastNum + middleNum + firstNum;


        System.out.println(reversedNum);



    }


    public static void main(String[] args){

        switchFirstLast();




    // checkPalindrom();

    }


}
