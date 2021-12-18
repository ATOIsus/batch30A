package chapter6ClassAndObject.ExampleAndExplanation;

public class PrivateExample {

    private String firstName;
    private String lastName;
    private int age;

    // This is called encapsulation.
    // Data is set to private and constructor is used to pass data safely.
    // If set to public everyone can access the data.


    // Constructor name and Class name should be same.
    public PrivateExample(String firstName, String lastName, int age) {

        // this.GlobalVariable = Parameter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public String toString() {
        return "\nName: " + firstName + " " + lastName +
                "\nAge:  " + age;
    }

    // To return individual properties.

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    // Returns the name and age to the object.
    // If toString is not used, the memory address is returned while printing the object.

}
