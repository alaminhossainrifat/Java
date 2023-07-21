import java.util.Scanner;

/**
 * Series_7
 */
public class Series_7 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int n,result=0;
        System.out.print("Enter the last number: ");
        n = input.nextInt();

        for (int i = 1; i <=n; i= i+2) {
            System.out.print(i+ " X ");
            result = result + i;

        }
        System.out.println(result);
    }
}