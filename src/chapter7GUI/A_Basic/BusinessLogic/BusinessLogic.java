package chapter7GUI.A_Basic.BusinessLogic;

public class BusinessLogic {

    private int firstNum;
    private int secondNum;

    public BusinessLogic(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;


        /*
            Work of Constructor:
                                a) Initialize variable.
                                b) To make object.


            a) Constructor is in a class.
            b) Constructor is called.

                1) Variables are initialized.
                2) A new object is created.
                3) The variables are passes into the actual constructor and processes are done.
                4) The result is returned.

        */

    }


    public int add() {
        return firstNum + secondNum;
    }


    public int firstNumber() {
        return firstNum;
    }


    public int secondNumber() {
        return secondNum;
    }

}
