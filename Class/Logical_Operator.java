import java.util.Scanner;

/**
 * Logical_Operator
 */
public class Logical_Operator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char ch;

        System.out.println(" Enter Any Letter: ");
        ch = input.next().charAt(0);

        // logical OR
        if(ch == 'a' || ch=='e' || ch == 'i' || ch == 'o' || ch == 'u')
        
        {
            System.out.println(" Vowel");
        }

        else{
            System.out.println("Consonant");
        }

        
    }
}