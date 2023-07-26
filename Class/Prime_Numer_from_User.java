import java.util.Scanner;

/**
 * Prime_Numer_from_User
 */
public class Prime_Numer_from_User {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m,n,result=0,totalprime=0;
        
        System.out.print("Enter Initial Number: ");
        m = input.nextInt();
        
        System.out.print("Enter Final Number: ");
        n = input.nextInt();

        for (int i = m; i <=n; i++) {
            
            for (int j = 2; j <= i-1; j++) {
                if (i%j==0) {
                    result ++;
                    break;
                }
                
            }
            if (result==0) {
                System.out.println(i);
                totalprime++;
            }
            result=0;
        }
        System.out.println("Total prime: "+totalprime);
    }
}