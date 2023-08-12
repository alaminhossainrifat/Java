import java.util.Scanner;

/**
 * Array_Sum_Avg
 */
public class Array_Sum_Avg {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double[] num = new double[5];

        double sum =0;
        System.out.print("Enter 5 Number: ");

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextDouble();

        }
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }

        double avg = sum / num.length;

        System.out.println("Average is: " +avg);
        System.out.println("sum is: "+sum);
    }
}