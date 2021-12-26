package chapter6ClassAndObject.A_ExampleAndExplanation;

public class PrivateObject {


    public static void main(String[] args) {

        PrivateExample person1 = new PrivateExample("Person", "One", 14);
        PrivateExample person2 = new PrivateExample("Person", "Two", 16);

        // Values are passed to the constructor which in turns passes the data to the class.

        System.out.println("\n" + person1);
        System.out.println("\n" + person2);

        System.out.println("\n" + person2.getAge());


    }

}
