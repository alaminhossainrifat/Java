import java.util.Scanner;

/**
 * Fectorial
 */
public class Fectorial {

    public static void main(String[] args) {
        
        int n,result=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any Positive Number: ");

        n = input.nextInt();

        for (int i = n; i >=1; i--) {
            
            result = result * i;
        }

        System.out.println("Factorial Of " +n + " = " +result);
    }
}