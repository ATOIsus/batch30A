package chapter6ClassAndObject;

public class AddNumber {


    public static void main(String[] args) {
        System.out.println("Addition: " + addTwo(1,2) );
        System.out.println("Addition: " + addTwo(1.5f,2) );
        System.out.println("Addition: " + addTwo(1,2.5f) );
        System.out.println("Addition: " + addTwo(1.5f,2.5f) );
    }


    // Same name different signature. Method Overloading.

    private static int addTwo(int a, int b) {

        return a + b;
    }

    private static float addTwo(int a, float b) {

        return a + b;
    }

    private static float addTwo(float a, int b) {

        return a + b;
    }

    private static float addTwo(float a, float b) {

        return a + b;
    }
}