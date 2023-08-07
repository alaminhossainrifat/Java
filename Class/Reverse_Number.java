import java.util.Scanner;

/**
 * Reverse_Number
 */
public class Reverse_Number {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n,temp,r,sum=0;
        System.out.print("Enter Any Number: ");
        n = input.nextInt();
        temp = n;

        while (temp !=0) {
            r = temp%10;
            sum = sum*10 + r;
            temp = temp/10;
        }

        System.out.println("Your Reverse Integer is: "+sum);
    }
}