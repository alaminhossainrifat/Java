/**
 * Array_for_each_loop
 */
public class Array_for_each_loop {

    public static void main(String[] args) {
        
        String[] names = {"Rifat" , "Roza" , "Hossain"};

        for( String x : names){
            System.out.println(x);
        }

        /*Sum */
        
        int[] num = { 11, 20, 30, 40, 50};
        int sum = 0;

        for( int x : num){
            sum = sum + x;
        }
        System.out.println("Sum is: "+sum);
    }
}