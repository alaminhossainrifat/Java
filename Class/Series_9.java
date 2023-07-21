import java.util.Scanner;

/**
 * Series_9
 */
public class Series_9 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int n,result=1;
        System.out.print("Enter the last number: ");
        n = input.nextInt();

        for (int i = 1; i <=n; i++) {
            System.out.print(i+ "^2X ");
            result = result*i*i;
            

        }
        System.out.println();
        System.out.println(result);
    }
}