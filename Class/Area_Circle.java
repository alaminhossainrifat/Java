import java.util.Scanner;

/**
 * Area_Circle
 */
public class Area_Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius;
        System.out.print("Enter Radius: ");

        radius = input.nextDouble();

        double circle = 3.1416 * radius * radius ;

        System.out.println("Area Of Circle: " +circle);
    }
}