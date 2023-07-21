import java.util.Scanner;

/**
 * Series_5
 */
public class Series_5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int n,sum=0;

        System.out.print("Enter the last value: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i=i+1) {
            System.out.print( +i + "^2+ ");
            sum = sum+i*i;
        }

        System.out.println();
        System.out.println(sum);
    }
}