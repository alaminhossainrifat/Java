import java.util.Scanner;

/**
 * Temp_Cel2fahren
 */
public class Temp_Cel2fahren {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double c,f;

        System.out.print("Enter Celsius: ");
        c = input.nextDouble();

        f = 1.8 * c + 32;

        System.out.println("Fehrenheit: "+f);
    }
}