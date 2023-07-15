import java.util.Scanner;

/**
 * PrintSumOfAllTheEvenNumbersFromMToN
 */
public class PrintSumOfAllTheEvenNumbersFromMToN {

    public static void main(String[] args) {
        
        int m,n,sum=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Initial Numbre: ");
        m = input.nextInt();

        System.out.print("Enter Final Number: ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {
            
            if (i%2==0) {
                sum = sum +i;
                System.out.print(" " +i);
            }

        }
        System.out.println();

         System.out.println("The Sum Of All Even Number is : " +sum);
       
    }
}