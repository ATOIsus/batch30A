package chapter2Condition;

import java.util.Scanner;

public class D_FourthProgram {


    public static void main(String[] args) {
        char userInput;
        char[] vowelArray = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        boolean isVowel = false;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet: ");
        userInput = sc.next().charAt(0);


        for (int i = 0; i < 1; i++) {
            if (userInput == vowelArray[i]) {
                System.out.println("The entered '" + userInput + "' is a vowel.");
                isVowel = true;
                break;
            }
        }

        if (!isVowel) {
            System.out.println("The entered '" + userInput + "' is a consonant.");
        }


    }


}
