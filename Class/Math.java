import javax.swing.event.SwingPropertyChangeSupport;

//import java.util.Scanner;

/**
 * Math
 */
public class Math {

    public static void main(String[] args) {
        
//        Scanner input = new Scanner(System.in);

        int x = 10;
        int y = 5;
        
        
        int max = Math.max(x, y);
        System.out.println("Maxium: "+max);

        int min = Math.min(x,y);
        System.out.println("Minium : "+min);

        double power = Math.pow(x,y);
        System.out.println("X to the power y: "+power);

    }

    private static double pow(int x, int y) {
        return 0;
    }

    private static int min(int x, int y) {
        return 0;
    }

    private static int max(int x, int y) {
        return 0;
    }

    
    
    

}