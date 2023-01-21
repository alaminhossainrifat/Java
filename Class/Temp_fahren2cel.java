import java.util.Scanner;

/**
 * Temp_fahren2cel
 */
public class Temp_fahren2cel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fer,cel;

        System.out.print("Enter Fehrenheit: ");
        fer = input.nextDouble();

        cel = 0.55555555556 * fer - 32;

        System.out.println("Celsius: "+cel);
    }
}