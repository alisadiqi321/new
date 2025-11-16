
package point.in.a.circal;
import java.util.Scanner;

public class PointInACircal {

    public static void main(String[] args) {
      //Geometry: point in a circle.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        if (Math.pow(x,2) + Math.pow(y,2) <= 100) {
            System.out.println("Point (" + x + ", " + y + ") is in the circle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the circle");
        }
    }
} 
   
