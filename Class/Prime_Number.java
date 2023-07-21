import java.util.Scanner;

/**
 * Prime_Number
 */
public class Prime_Number {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int n,result=0;
        System.out.print("Enter any positive integer: ");
        n =input.nextInt();


        for (int i = 2; i < n; i++) {
            
            if (n%i==0) {
                result++;
                break;
            }
        }
        if (result==0) {
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}