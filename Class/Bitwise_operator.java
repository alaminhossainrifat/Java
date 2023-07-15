import java.util.Scanner;

/**
 * InnerBitwise_operator
 */
public class Bitwise_operator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a = 32;
        int b = 12;

        int c;

        // bitwise And (Work on Binary Number)
        c = a&b;
        System.out.println("a & b = "+c);

        // bitwise OR {Binary plus(যোগ)}
        c = a | b;
        System.out.println("a | b: "+c);

        // bitwise Exor
        c = a^b;
        System.out.println("a^b: "+c);

        // Bitwise Right Shift
        c = a>>3;
        System.out.println("a>>3="+c);

        // Bitwise left Shift
        c = a<<3;
        System.out.println("a<<3="+c);
    }
}