import java.util.Scanner;

/**
 * Logical_Operator2
 */
public class Logical_Operator2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char ch;

        System.out.print(" Enter Any Letter: ");
        ch = input.next().charAt(0);

        // Logical AND
        if(ch>='a' && ch<='z'){
            System.out.println("Small Letter");
        }

        else if(ch>='A' && ch<='Z'){
            System.out.println(" Capital Letter");
        }

        else{
            System.out.println("Number Not Allow");
        }
    }
}