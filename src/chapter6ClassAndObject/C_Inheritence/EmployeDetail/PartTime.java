package chapter6ClassAndObject.C_Inheritence.EmployeDetail;

public class PartTime extends Employee{

    public float hourlySalary;
    public int noOfDays = 26;

    public float annualSalary(){
        return hourlySalary * noOfDays * 12;
    }

}
