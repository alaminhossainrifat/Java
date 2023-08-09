import java.util.Scanner;

/**
 * Pattern_2
 */
public class Pattern_2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int n = input.nextInt();

        for (int row = n; row >=1; row--) {
            
            for (int col = 1; col <= row; col++) {
                
                System.out.print("  "+col);
            }
            System.out.println();
        }
    }
}