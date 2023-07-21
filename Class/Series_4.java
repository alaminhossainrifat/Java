import java.util.Scanner;

/**
 * Series_4
 */
public class Series_4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        double n,sum=0;

        System.out.print("Enter the last value: ");
        n = input.nextDouble();

        for (double i = 1.5; i <= n; i=i+1) {
            System.out.print(" " +i);
            sum = sum+i;
        }

        System.out.println();
        System.out.println(sum);
    }
}