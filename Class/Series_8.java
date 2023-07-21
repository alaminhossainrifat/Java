import java.util.Scanner;

/**
 * Series_8
 */
public class Series_8 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        double n,result=0;
        System.out.print("Enter last value: ");
        n = input.nextDouble();

        for (double i = 1.5; i <=n; i++) {
            System.out.print(i+" X ");
            result = result + i;
    
        }

        System.out.print(result);
    }
}