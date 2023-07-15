import java.util.Scanner;

/**
 * InnerprintEvenNumberFromMToN2
 */
public class PrintSumOfAllTheNumbersFromMToN {

    public static void main(String[] args) {
        
        int m,n,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Initial Number: ");
        m = input.nextInt();

        System.out.print("Enter Final Number: ");
        n = input.nextInt();

        for (int i = m; i <=n ; i++) {

            sum = sum + i;
        }

        System.out.println("The Sum Is: " +sum);

    }
}