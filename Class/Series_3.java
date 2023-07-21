import java.util.Scanner;

/**
 * Series_3
 */
public class Series_3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int n,sum=0;

        System.out.print("Enter the last value: ");
        n = input.nextInt();

        for (int i = 2; i <= n; i=i+2) {
            System.out.print(" " +i);
            sum = sum+2;
        }

        System.out.println();
        System.out.println(sum);
    }
}