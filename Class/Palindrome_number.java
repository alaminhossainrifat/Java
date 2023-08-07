import java.util.Scanner;

/**
 * Palindrome_number
 */
public class Palindrome_number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,temp,r,sum=0;
        System.out.print("Enter Any Integer: ");
        n = input.nextInt();
        temp = n;

        while (temp!=0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp /10;
        }
        if (n == sum) {
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome Number");
        }
    }
}