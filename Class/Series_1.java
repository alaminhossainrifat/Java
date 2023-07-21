import java.util.Scanner;

/**
  * Series_1
  */
 public class Series_1 {
 
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        int n,sum=0;
        System.out.print("Enter the last value: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i=i+1) {
            
            System.out.print( " " +i);
            sum = sum + i;
        }
        
        System.out.println();
        System.out.println(sum);
    }
 }