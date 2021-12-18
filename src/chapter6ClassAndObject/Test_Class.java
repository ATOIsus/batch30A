package chapter6ClassAndObject;

public class Test_Class {


    public static void main(String[] args) {

        N_FourtenthProgram person1 = new N_FourtenthProgram();
        person1.firstName = "Person";
        person1.lastName = "one";
        person1.age = 4;

        N_FourtenthProgram person2 = new N_FourtenthProgram();
        person2.firstName = "Person";
        person2.lastName = "two";
        person2.age = 40;


        System.out.println("\nName: " + person1.firstName + " " + person1.lastName);
        System.out.println("Age   : " + person2.age);

        System.out.println("\nName: " + person2.firstName + " " + person2.lastName);
        System.out.println("Age   : " + person2.age);

        System.out.println(person1);

    }


}
