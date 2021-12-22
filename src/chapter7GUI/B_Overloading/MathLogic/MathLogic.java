package chapter7GUI.B_Overloading.MathLogic;

public class MathLogic {

    private int firstNum;
    private int secondNum;

    public MathLogic() {
        this.firstNum = 0;
        this.secondNum = 0;
    }


    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public int firstNumber() {
        return firstNum;
    }

    public int secondNumber() {
        return secondNum;
    }

    public int add() {
        return firstNum + secondNum;
    }

    public int subtract() {
        return firstNum - secondNum;
    }

    public int multiply() {
        return firstNum * secondNum;
    }

    public int divide() {
        return firstNum / secondNum;
    }


}
