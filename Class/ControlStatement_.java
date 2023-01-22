import java.util.Scanner;

/**
 * ControlStatement_
 * Control Statement_(if_else_if_and else)
 */
public class ControlStatement_ {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Enter Number: ");

        num = input.nextInt();

        if (num > 0) {
            System.out.println("Positive");
        }

        else if (num < 0 ) {
            System.out.println("Negative: ");
        }

        else{
            System.out.println("Equal To Zero");
        } 


    }
}