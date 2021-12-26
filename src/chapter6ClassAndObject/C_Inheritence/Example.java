package chapter6ClassAndObject.C_Inheritence;

class Example {

    // Parent, Base, Super class.

    int salary = 40000;

}

/* If there are multiple class in the same java file:

    a) The parent and child are in the same java file.
    b) The name of the java file needs to be that of the parent class.

    > The classes can be separated into individual java files.


    > Behaviour: Function, Method.
    > Properties: Variables.

 */


class Programmer extends Example {

    // Child class.
    // Extends keyword is used to inherit properties from the parent class.
    // Inheritance is used to reduce the lines of code.
    // i.e. If classes have similar properties, the properties can be shared.

    int bonus = 10000;

    int total = bonus + salary;

    public static void main(String[] args) {
        Programmer p = new Programmer();

        System.out.println("Salary : " + p.salary);
        System.out.println("Bonus  : " + p.bonus);
        System.out.println("Total  : " + p.total);
    }

}
