package chapter6ClassAndObject.D_Polymorphism.Bank;

public class ICIC extends MainBank{

    @Override
    protected int getInterestRate() {
        return super.getInterestRate() + 2;
    }
}
