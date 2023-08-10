/**
 * Array
 */
public class Array {

    public static void main(String[] args) {
        
        int[] num = new int[10];

        num[0] = 10;
        num[1] = 10;
        num[2] = 10;
        num[3] = 10;
        num[4] = 10;
        num[5] = 10;
        num[6] = 10;
        num[7] = 10;
        num[8] = 10;
        num[9] = 10;

        System.out.println("Array Size is : "+num.length); /*Array Size */

        /*For Sum */
        int sum = num[0] + num[1] + num[2] + num[3] + num[4] + num[5] + num[6] + num[7] + num[8] + num[9];
        System.out.println("The sum is: "+sum);

    } 
}