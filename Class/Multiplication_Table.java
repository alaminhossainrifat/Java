import java.util.Scanner;

/**
 * Multiplication_Table
 */
public class Multiplication_Table {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter any number: ");
        n = input.nextInt();

        for (int i = 1; i <=10; i++) {
            
            System.out.println(n+ " X " +i + " = " +n*i);
        }
    }
}