package perimeter.of.a.tringle;

import java.util.Scanner;

public class PerimeterOfATringle {

    public static void main(String[] args) {

//Compute the perimeter of a triangle).
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three edges of a triangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Perimeter of the triangle is " + (a + b + c));
        } else {
            System.out.println("Invalid input: Not a valid triangle");
        }
    }
}
}
    
}
