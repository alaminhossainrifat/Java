import java.util.Scanner;

/**
 * EvenOdd_Number
 */
public class EvenOdd_Number {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Enter Any Positive Number: " );
        num = input.nextInt();

        if (num%2==0){
            System.out.println("Even");
        }

        else{
            System.out.println("Odd");
        }

    }
}