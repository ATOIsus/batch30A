import java.util.Scanner;

// ctrl + alt + l for alignment
// ctrl + d       for copying a line


public class B_SecondProgram {

    public static float simpleInterest(float principle, float time, float rate) {

        float simpleInterest;

        simpleInterest = (principle * time * rate) / 100;

        return simpleInterest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float principle;
        float time;
        float rate;

        System.out.print("Enter principle: ");
        principle = sc.nextFloat();

        System.out.print("Enter time: ");
        time = sc.nextFloat();

        System.out.print("Enter rate: ");
        rate = sc.nextFloat();

        float SimpleInterest = simpleInterest(principle, time, rate);

        System.out.println("The simple interest of " + principle + " at time " + time + "with rate " + rate + " is " + SimpleInterest);


    }

}
