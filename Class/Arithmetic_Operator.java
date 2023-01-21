import java.util.Scanner;

/**
 * Arithmetic_Operator
 */
public class Arithmetic_Operator {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        /*
        int num1,num2,result;
        
        num1 = 30;
        num2 = 10;


        result = num1 + num2;
        System.out.println("Sum = "+result);


        result = num1 - num2;
        System.out.println("Sub = "+result);


        result = num1 * num2;
        System.out.println("Multipliction = "+result);


         result =  num1 / num2;
        System.out.println("Div = "+result);


        result = num1 % num2;
        System.out.println("Remainder = "+result);
         */


         Scanner input = new Scanner (System.in);

         int num1,num2,result;

         System.out.print("Enter First Number: ");
         num1 = input.nextInt();
         
         System.out.print("Enter Second Number: ");
         num2 = input.nextInt();

         result = num1 + num2;
         System.out.println("Sum :"+result);

         result = num1 - num2;
         System.out.println("Sub: "+result);

         result = num1 * num2;
         System.out.println("Multiplication: "+result);

         double result1 = (double) num1 / num2;
         System.out.println("Divide: "+result1);

         result = num1 % num2;
         System.out.println("Remainder: "+result);

    }
    
}
