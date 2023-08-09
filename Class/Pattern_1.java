import java.util.Scanner;

/**
 * Pattern_1
 */
public class Pattern_1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = input.nextInt();

        for (int row = 1; row <= n; row++) {
            
            for (int col = 1; col <= row; col++) {
                System.out.print(" "+col);
                /* System.out.print(" * "); ( Which I want to print like- *-/#/ etc) */
            }
            System.out.println();
        }
    }
}