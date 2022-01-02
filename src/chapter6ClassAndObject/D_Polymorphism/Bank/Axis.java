package chapter6ClassAndObject.D_Polymorphism.Bank;

public class Axis extends MainBank{

    @Override
    protected int getInterestRate() {
        return super.getInterestRate() + 10;
    }
}
