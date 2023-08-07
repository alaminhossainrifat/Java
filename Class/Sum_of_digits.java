import java.util.Scanner;

/**
 * Sum_of_digits
 */
public class Sum_of_digits {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n, temp,r,sum=0;
        System.out.print("Enter Positive Integer: ");
        n= input.nextInt();
        temp=n;

        while (temp !=0) {
            r = temp % 10;
            sum = sum + r;
            temp = temp/10;
        }

        System.out.println("Sum Of Digits is: " +sum);
    }
}