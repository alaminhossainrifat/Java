import java.util.Scanner;

/**
 * Area_triangle
 */
public class Area_triangle {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    double base,height,area;

    System.out.print("Enter Base: ");
    base = input.nextDouble();

    System.out.print("Enter Height: ");
    height = input.nextDouble();

    area = 0.5 * base * height;

    System.out.println("Area Of Triangle: "+area);

    }

}