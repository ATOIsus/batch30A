package chapter6ClassAndObject.Exercise;

public class ArithmeticObject {


    public static void main(String[] args) {

        Arithmetic obj1 = new Arithmetic(2 , 4 , 5);

        System.out.println(obj1);
        System.out.println(obj1.add());
        System.out.println(obj1.subtract());
        System.out.println(obj1.multiply());
        System.out.println(obj1.divide());

    }


}
