
package random.point;

import java.util.Scanner;

public class RandomPoint {

    public static void main(String[] args) {
        //Random point
        Scanner input = new Scanner(System.in);
        double x = (int) (Math.random() * 100 - 50);
        double y = (int) (Math.random() * 200 - 100);
        System.out.println("The random point in thise rectangle is " + x + " and " + y);
 
    }
    
}
