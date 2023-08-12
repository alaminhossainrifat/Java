import java.util.Scanner;

/**
 * Array_Max_Min
 */
public class Array_Max_Min {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter 5 Degits: ");

        double[] num = new double[5];
        double sum=0;

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextDouble();
        }

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }

        /*Maximum start here */

        double max = num[0];

        for (int i = 1; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        System.out.println("Maximum number is: "+max);

         /*Maximum end here */

         /*Minimum start here */

          double min = num[0];

          for (int i = 1; i < num.length; i++) {
                if (min > num[i]) {
                    min = num[i];
                }
          }
          System.out.println("Minimun Number is: "+min);

          /*Minimum end here */

        double avg = sum / num.length;
        System.out.println("The Sum is: "+sum);
        System.out.println("Average is: "+avg);
    }
}