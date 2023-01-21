/**
 * Unary_Operator
 */
public class Unary_Operator {

    public static void main(String[] args) {
        int x =-50;
        int result;


        // result=(- * + = -)
        result = +x; 
        System.out.println("Result: "+result);


        // Result=(- * - = +)
        result = -x; 
        System.out.println("Result: "+result);


        /*
         * Increment 
         * -->post Increment
         */

        int y = 50;
        int z;


         result = y++;
         System.out.println("y = "+result);

         result = y;
         System.out.println("y=: "+result);

        /*
         * Increment 
         * -->Pre Increment
         */

         result = ++y;
         System.out.println("y = "+result);



         /*
         * Decrement 
         * -->post Decrement
         */

         result = y--;
         System.out.println("y = "+result);


         result = y;
         System.out.println("y=: "+result);

          /*
         * Decrement 
         * -->Pre Decrement
         */

         result = --y;
         System.out.println("y= "+result);




    }
}