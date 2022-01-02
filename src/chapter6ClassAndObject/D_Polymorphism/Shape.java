package chapter6ClassAndObject.D_Polymorphism;

// Parent class.

public class Shape {



    float area(int radius) {

        return (float) ((radius * radius) * 3.14);
    }

    float area(float side) {

        return side * side;
    }

    float area(float length, float breadth) {

        return length * breadth;
    }



}
