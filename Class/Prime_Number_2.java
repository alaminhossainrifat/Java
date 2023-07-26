import java.util.Scanner;

/**
 * Prime_Number
 * 0-1 problem
 */
public class Prime_Number_2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int n,result=0;
        System.out.print("Enter any positive integer: ");
        n =input.nextInt();


        if (n ==0 || n==1) {
            System.out.println("Not Prime");
        }else{

           for (int i = 2; i < n/2; i++) {
            
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
}