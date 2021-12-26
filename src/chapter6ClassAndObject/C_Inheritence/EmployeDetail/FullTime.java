package chapter6ClassAndObject.C_Inheritence.EmployeDetail;

public class FullTime extends Employee{

    public float monthlySalary = 20000;

    public float annualSalary(){

        return monthlySalary * 12;

    }

}
