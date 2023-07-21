import java.util.Scanner;

/**
 * Multiplication_Table_Nasted_Loop
 */
public class Multiplication_Table_Nasted_Loop {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int m,n;
        System.out.print("Enter The First Number: ");
        m = input.nextInt();
        
        System.out.print("Enter The Last Number: ");
        n = input.nextInt();

        for (int i = m; i <=n; i++) {


            for (int j = 1; j <=10; j++) {
                
                System.out.println(i+ " X " +j + " = " +i*j);
            }
            System.out.println("\n\n");
        }
        
    }
}