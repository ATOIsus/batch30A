package chapter6ClassAndObject.D_Polymorphism;

// Parent class.

public class Shape {



    protected float area(int radius) {

        return (float) ((radius * radius) * 3.14);
    }

    protected float area(float side) {

        return side * side;
    }

    protected float area(float length, float breadth) {

        return length * breadth;
    }



}
