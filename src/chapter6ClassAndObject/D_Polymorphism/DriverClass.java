package chapter6ClassAndObject.D_Polymorphism;

public class DriverClass {

    public static void main(String[] args) {

        // Shape(Parent class) is used.

        Shape cr = new Circle();
        float areaCircle = cr.area(3);

        Shape re = new Rectangle();
        float areaRectangle = re.area(12, 12);

        Shape sq = new Square();
        float areaSquare = sq.area(2.4f);


        System.out.println("\nThe area of circle    is " + areaCircle);
        System.out.println("The area of rectangle is " + areaRectangle);
        System.out.println("The area of square    is " + areaSquare);


    }


    // this  for current class.
    // super for parent class.
    // In polymorphism: <Child> is a <Parent>
    //                   Circle is a Shape.
    //                   Rectangle is a Shape.
}
