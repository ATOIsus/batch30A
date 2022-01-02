package chapter6ClassAndObject.C_Inheritence.EmployeDetail;

public class Employee {

    public String fname;
    public String lname;
    public String dob;


    public String displayName() {
        return fname + " " + lname;
    }


    public int sumTwo(int a, int b) {

        return a + b;

    }
}