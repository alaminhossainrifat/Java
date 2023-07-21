import java.util.Scanner;

/**
 * Series_2
 */
public class Series_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n,sum=0;
        System.out.print(" Enter The Last Value : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i= i+2) {
            System.out.print(" " +i);
            sum = sum +i;
        }
        System.out.println();
        System.out.println(sum);
    }
}