package chapter6ClassAndObject.Exercise;

public class Arithmetic {



    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public Arithmetic(int firstNumber, int secondNumber, int thirdNumber) {

        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }




    public String toString() {
        return "\nFirst Number: " + firstNumber +
                "\nSecond Number " + secondNumber +
                "\nThirdNumber:  " + thirdNumber;
    }

    // To return individual properties.

    public int add() {
        return firstNumber + secondNumber + thirdNumber;
    }

    public int subtract() {
        return firstNumber - secondNumber - thirdNumber;
    }

    public int multiply() {
        return firstNumber * secondNumber * thirdNumber;
    }

    public int divide() {
        return firstNumber / secondNumber / thirdNumber;
    }




}
