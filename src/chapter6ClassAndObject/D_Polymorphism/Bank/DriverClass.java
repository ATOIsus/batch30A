package chapter6ClassAndObject.D_Polymorphism.Bank;


public class DriverClass {

    public static void main(String[] args) {

        MainBank axisBank = new Axis();
        MainBank icicBank = new ICIC();
        MainBank sbiBank  = new SBI();

        System.out.println("\nThe Interest rate of Axis bank is " + axisBank.getInterestRate());
        System.out.println("The Interest rate of ICIC bank is " +icicBank.getInterestRate());
        System.out.println("The Interest rate of SBI bank  is " +sbiBank.getInterestRate());

    }

}
