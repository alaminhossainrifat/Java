/**
 * PrintSumOfAllTheNumbersFrom1To10
 */
public class PrintSumOfAllTheNumbersFrom1To10 {

    public static void main(String[] args) {
        
        int sum=0;

        for (int i = 1; i <= 10; i++) {

            sum= sum + i;
            
        }
        System.out.println("The Sum is : " +sum);
    }
}