package chapter6ClassAndObject.D_Polymorphism.Bank;

public class SBI extends MainBank{

    @Override
    protected int getInterestRate() {
        return super.getInterestRate() + 4;
    }
}
