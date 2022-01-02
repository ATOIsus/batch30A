package chapter6ClassAndObject.C_Inheritence.EmployeDetail;

public class DriverClass {


    /*
     *  The driver class has main method to execute the code.
     *  It is used to test if the logic is correct.
     */


    public static void main(String[] args) {
        FullTime ft = new FullTime();
        ft.fname = "A";
        ft.lname = "Bhai";
        ft.dob = "January 1 2021";
        ft.monthlySalary = 100;


        PartTime pt = new PartTime();
        pt.fname = "K";
        pt.lname = "Cha";
        pt.dob = "May 3 2000";
        pt.hourlySalary = 10;

        int result = pt.sumTwo(1, 3);
        System.out.println("Sum is " + result);

        System.out.println("\n" + ft.displayName() + " has salary : " + ft.annualSalary());
        System.out.println(pt.displayName() + " has salary : " + pt.annualSalary());


    }

}
