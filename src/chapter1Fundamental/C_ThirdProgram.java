package chapter1Fundamental;

import java.util.Scanner;

public class C_ThirdProgram {

    public static void main(String[] args) {

        float length;
        float breadth;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        length = sc.nextFloat();

        System.out.print("Enter Breadth: ");
        breadth = sc.nextFloat();


        if (length == breadth) {
            System.out.println("The rectangle is a square.");
        } else {
            System.out.println("The rectangle is not a square.");
        }

    }

}
