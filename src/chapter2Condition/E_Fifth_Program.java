package chapter2Condition;

import java.util.Scanner;

public class E_Fifth_Program {

    public static void checkPalindrom() {
        int userInput;
        int lastDigit;
        int firstDigit;
        int palindrom;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        userInput = sc.nextInt();

        lastDigit = userInput % 10;
        firstDigit = userInput / 10;

        palindrom = lastDigit * 10 + firstDigit;

        if (userInput == palindrom) {
            System.out.println("The number " + userInput + " is a palindrom.");
        } else {
            System.out.println("The number " + userInput + " is not a palindrom.");
        }
    }

    public static void checkPerson() {
        int age;
        boolean male;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        age = sc.nextInt();

        System.out.print("Are you a male? true or false: ");
        male = sc.nextBoolean();

        if (male) {
            if (age > 20) {
                System.out.println("You are a man.");
            } else {
                System.out.println("You are a boy.");
            }
        } else {
            if (age > 20) {
                System.out.println("You are a woman.");
            } else {
                System.out.println("You are a girl.");
            }
        }
    }

    public static void main(String[] args) {
        checkPerson();

    }


}