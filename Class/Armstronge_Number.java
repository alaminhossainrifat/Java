import java.util.Scanner;

/**
 * Armstronge_Number
 */
public class Armstronge_Number {

    public class InnerArmstronge_Number {
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n, temp, r, sum=0;

            System.out.print("Enter the number: ");
            n = input.nextInt();

            temp=n;

            while (temp!=0) {
                r = temp%10;
                sum = sum +r*r*r;
                temp = temp/10;

            }
            if (n==sum) {
                System.out.println("Armstronge Number");
            }
            else{
                System.out.println("Not Armstronge Number");
            }
            
        }
    }
}